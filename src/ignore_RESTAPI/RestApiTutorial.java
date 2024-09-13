package ignore_RESTAPI;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestApiTutorial {

    public static void main(String[] args) throws  Exception {


        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://github.com/johnmarty3/JavaAPITutorial/blob/main/Thirsty.mp4");
        Gson gson = new Gson();

        String jsonRequest = gson.toJson(transcript);
        System.out.println(jsonRequest);


        HttpRequest postRequest =  HttpRequest.newBuilder()
        .uri(new URI("https://api.assemblyai.com/v2/transcript"))
        .header("Authorization", "eb0bce4d7e6e4d7ca515c8d00bf7e3a4")
        .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
        .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postReponse= httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postReponse.body());

        transcript = gson.fromJson(postReponse.body(), Transcript.class);
        transcript.getId();

        HttpRequest getRequest =  HttpRequest.newBuilder()
        .uri(new URI("https://api.assemblyai.com/v2/transcript"))
        .header("Authorization", "eb0bce4d7e6e4d7ca515c8d00bf7e3a4" + transcript.getId())
        .build();

        while (true)
        {
            HttpResponse<String> getReponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
            transcript = gson.fromJson(getReponse.body(), Transcript.class);

            System.out.println(transcript.getStatus());

            if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())){
                break;
            }

            // Wait 10s if not complete or error
            Thread.sleep(10000);
            }
        System.out.println("Transcription Complete");
            System.out.println(transcript.getText());
        }


    }




