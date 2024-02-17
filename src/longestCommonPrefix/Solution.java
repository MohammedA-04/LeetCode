package longestCommonPrefix;

import java.util.Arrays;

public class Solution {

   /*
    - check if its null
    - other has element
        - then sort
        -
    */



    // Prefix: Is a couple of letters at the beginning of word ('dis', 'mis', 'non')
    static String[] prefixDictionary = {"dis", "mis", "non"};
    static String[] inputArray = {"respect", "spell", "fiction" };


    public static String longestCommonPrefix(String[] strs) {

        // check if: empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // if it has something inside


        String prefix = strs[0];


        return prefix;
    }
}







