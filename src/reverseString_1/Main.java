package reverseString_1;
// CompileErr: compiling code into machine code [e.g., syntax]
// RuntimeErr: refers to code execution [e.g., index out of bounds]

/* Example:
   - For 'Hello' start at i[5] or (len -1)
   - Continue if 'i' is not EQUAL to 0
 */

public class Main {

    // Function within Main.java class!!
    public static String reverseString(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result = result + str.charAt(i);
        }

        return result;
    }

    // String Builder Implementation
    public static StringBuilder reverseStringBuilder(StringBuilder strBuilder){

        StringBuilder result = new StringBuilder();

        for(int i=strBuilder.length()-1; i>=0; i--){
            result = result.append(strBuilder.charAt(i));
        }

        return result;
    }




    public static void main(String[] args){

        // New Object of 'Main' class
        String str = "Hello World, My name is Mohammed Ahmed!"; // String to be reversed
        Main mainObject = new Main();
        String res = reverseString(str);
        System.out.println(res);

        // Using String Builder
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("String Builder Backward :)");

        StringBuilder resSB = reverseStringBuilder(strBuilder);
        System.out.println(resSB.toString());

    }

}
