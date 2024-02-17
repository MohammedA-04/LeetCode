package lengthOfLongestSolution;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {

        int maxLength =0;

        // Right & Left Pointer =0
        // Increment Right Pointer

        // loops till the end of array
        for(int right=0, left=0; right < s.length(); right++){

            //
            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);

            // if index appeared is not equal to i[right]
            if (indexOfFirstAppearanceInSubstring != right){

                // then add increment left index
                left = indexOfFirstAppearanceInSubstring +1;

            }

            // + 1 required so that if 0-0=0 is wrong as one index is len 1
            // returns the biggest out of the two max-length or subString
            maxLength = Math.max(maxLength, right - left +1);

        }

        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabd"));
        System.out.println();
    }

}


