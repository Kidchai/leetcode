package problem_0001;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int i = 0;
        int j = copy.length - 1;

        while (true) {
            int sum = copy[i] + copy[j];
            if (sum == target) {
                int id1 = findIndex(nums, copy[i], -1);
                int id2 = findIndex(nums, copy[j], id1);
                return new int[]{id1, id2};
            }

            if (sum > target)
                j--;
            else
                i++;
        }
    }

    private int findIndex(int[] nums, int number, int busyIndex) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number && i != busyIndex) {
                index = i;
                break;
            }
        }
        return index;
    }
}
