package LongestSubstringNoDupes_3.V2;

import java.util.HashSet;

public class Main {

    // AI Generated to avoid Output Exceeded Limit
    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> seenChars = new HashSet<>();
        int maxLen = 0;
        int start = 0;

        // Sliding window approach
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If character is already in the set, shrink the window from the left
            while (seenChars.contains(currentChar)) {
                seenChars.remove(s.charAt(start));
                start++;
            }

            // Add the current character to the set
            seenChars.add(currentChar);

            // Update the maximum length of substring without duplicates
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
}
}

