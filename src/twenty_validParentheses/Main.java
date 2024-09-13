package twenty_validParentheses;

import java.util.Stack;

public class Main{
    private static final String openBrackets = "([{";
    private static final String closeBrackets = ")]}";
    static String s = "()";

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.isValid(s));
    }


    public boolean isValid(String str){

        Stack<Character> stack = new Stack<>();

        for (int i=0; i < str.length(); i++){

            // e.g., points to "(" in ([])
            char c = str.charAt(i);

            if(openBracket(c)){
                stack.push(c);
            }else {
                if(stack.isEmpty() || !isMatching(stack.pop(), c)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // if 'c' is 0,1,2 in string then is TRUE
    // if == -1 then FALSE
    private boolean openBracket (char c){
        return openBrackets.indexOf(c) != -1;
    }

    // pops stack and gets c
    private boolean isMatching(char open, char close){
        return openBrackets.indexOf(open) == closeBrackets.indexOf(close);
    }
}