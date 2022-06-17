package day19_array;

public class MinimumNumber {
    public static void main(String[] args) {

        int[] nums = {23, 34, 54, 6, -4, -9, -32};
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println(min);
    }
}
