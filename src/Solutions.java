class TwoSum {


    int target = 9;
    int[] nums = {2, 7, 11, 15};

    public int[] twoSum(int[] list, int target) {

        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]

        // check index0 and 1 = ? == target = true
        // index0+1 and 1+1


        for (int i = 0; i < list.length - 1; i++) {
            int start = list[i]; // 2 ... 11;


            for (int j = i + 1; j < list.length; j++) {
                int oneAhead = list[j]; // 7 ... 15

                if (start + oneAhead == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[]{i, j};
                }
            }

        }

        // otherwise failed
        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        obj.twoSum(obj.nums, obj.target);
    }

}