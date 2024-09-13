package twentyOne_mergeTwoSortedList;

//

import java.util.Arrays;

public class Main {

    static int[] a1 = {1,2,4};
    static int[] a2 = {1,3,4};

    public static void main(String[] args) {
        Main main = new Main();
        int[] merged = main.mergeTwoLists(a1, a2);

        System.out.println(Arrays.toString(merged));

    }


    public  int[] mergeTwoLists( int[] list1, int[] list2){

        int totalLen = list1.length + list2.length;
        int[] mergedArray = new int[totalLen];

        int LP1 =0, LP2 =0, count=0;

        // means contains node
        while (LP1 < list1.length && LP2 < list2.length && count < totalLen) {

            // l1[i] is less l2[i] = at count append l1 [at lp1]
            if (list1[LP1] < list2[LP2]) {
                mergedArray[count++] = list1[LP1++];
            } else {
                mergedArray[count++] = list2[LP2++];
            }
        }

        // While loops to copy remaining from either list

        // at last point lp1 is 2 and count is 5
        // lp1 at index2 is added to mergedArray at index 5
        while (LP1 < list1.length && count < totalLen) {
            mergedArray[count++] = list1[LP1++];
        }

        // Copy remaining elements from list2
        while (LP2 < list2.length && count < totalLen) {
            mergedArray[count++] = list2[LP2++];
        }




      return mergedArray;

    }



}
