package LongestSubstringNoDupes_3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    // Generate all possible substring
    /* Solution
       - loop till len-1 (last index)
       - generate all strings
       - check dupe
       - update count
     */

    public static void main(String[] args) {

        String a = "abcabcbb";
        // all possible are:
        // ans: 'a', 'ab', 'abc', 'abca', 'abcab', 'abcabc', 'abcabcb' 'abcabcbb'

        ArrayList<String> allSubstrings = new ArrayList<>();
        allSubstrings = generateAllPossibleSubstring(a);
        System.out.println(maxLenSubString(allSubstrings));




    }


    public static ArrayList<String> generateAllPossibleSubstring(String s){

        ArrayList<String> sArrayList = new ArrayList<>();

        // Looping
        for (int i=0; i < s.length(); i++){
            for(int j=i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                sArrayList.add(s.substring(i, j));
                // Returns new string of chosen indexes 1||2x param?
            }
        }

        return sArrayList;
    }

    public static int maxLenSubString(ArrayList<String> allSubstrings){

        // Loop thru substrings
        // Check dupe: has dupe skip iteration / no dupe get len

        int maxLen = 0;

        for (int i = 0; i <allSubstrings.size() ; i++) {

            // Has No Dupe
            if(hasDupeChar(allSubstrings.get(i)) == false){
                int lenAtI = allSubstrings.get(i).length();

                // len at I larger than max len then assign new max len
                if(lenAtI > maxLen){
                    maxLen = lenAtI;
                }
            }
            else {
               continue;  // Has Dupe Skip Iteration
            }


        }
        return maxLen;
    }

    // Dupe Checker
    public static boolean hasDupeChar(String subStringInArrList){

        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char c: subStringInArrList.toCharArray()){
            // Put char as arg c into map
            // Get value of k,v or insert v+1
            // we are checking if argument c character is in map, if yes +1
            charCount.put(c, charCount.getOrDefault(c,0)+ 1);

            // if arg c has +1 then it's a DUPE!
            if(charCount.get(c) >1){
                return true;
            }
        }

        return false;
    }

}
