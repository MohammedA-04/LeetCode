package longestCommonPrefix;

import java.util.Arrays;

public class Solution2 {


        // Not My Solution
        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int idx = 0;

            while(idx < s1.length() && idx < s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    idx++;
                } else {
                    break;
                }
            }

            return s1.substring(0, idx);
        }


    public static void main(String[] args) {

        String[] inputArray1 = {"respect", "spell", "fiction"};
        longestCommonPrefix(inputArray1);

    }
}
