package problem_0026;

class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int size = removeDuplicates(nums);
        System.out.printf("size: %d\n", size);
        for (int i = 0; i < size; i++) {
            System.out.printf("%d, ", nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int[] copy = new int[nums.length];

        // Copy array
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }

        // Fill nums with unique values
        int j = 0;
        int added = Integer.MAX_VALUE;
        for (int i = 0; i < copy.length; i++) {
            if (nums[i] == added)
                continue;
            nums[j] = copy[i];
            added = copy[i];
            System.out.printf("nums[%d] = %d\n", j, copy[i]);
            j++;
        }
        return j;
    }
}
