import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

     List<String> list = new ArrayList<>(); // ["1", "2", "1"]
     StringTokenizer st;


        public boolean isPalindrome(String x) {

            st = new StringTokenizer(x, " ");

            while(st.hasMoreElements()) {

                String token = st.nextToken();
                list.add(token);

            }

            // Greater than 1 && list[0] == list[size of list(n-1)] then true
            if(list.size() > 1){
                if ( list.get(0).equals(list.get(list.size() -1)) ) {
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args){

            Solution obj = new Solution();
            boolean bol = obj.isPalindrome("1 2 1");

            if (bol) {
                System.out.println(bol);
            } else {
                System.out.println(bol);
            }


            // ignore solution 2
            Solution2 obj2 = new Solution2();
            obj2.isPalindrome(121);
            obj2.isPalindrome(-121);
            obj2.isPalindrome(10);

            if (obj2.isPalindrome(121) && obj2.isPalindrome(-121) && obj2.isPalindrome(10)) {
                System.out.println(bol);
            } else {
                System.out.println(bol);
            }
        }

    }



class Solution2 {



    public boolean isPalindrome(int x) {


        String s = String.valueOf(x);



        String i=  s.substring(0,1);
        String j = s.substring( s.length()-1);


            if(i.equals(j)) {
                return true;
            }else{
                return false;
            }
    }
}
