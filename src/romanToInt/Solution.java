package romanToInt;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int romanToInt (String s)
    {

        Map<Character, Integer> map = new HashMap<>();
        {
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        }
        // IV != 6  but IV == 4
        // IX != 11 but IX == 9
        int ans =0;

        // Loop till end of loop
        for (int i = 0; i < s.length(); i++) {

            // V is accompanied by I then subtraction required
            // Is Current (i) is smaller Current Ch (i+1)
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
            {
                ans = ans - map.get(s.charAt(i));
            }

            // Other V is accompanied by either X,L,C,D,M then addition required
            // Encase: Current I is bigger than I+1
            else
            {

                ans = ans + map.get(s.charAt(i));
            }
        }

     return ans;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("VI"));  //  6
        System.out.println(romanToInt("IV"));  //  4
        System.out.println(romanToInt("III")); //  3
    }

}
