package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length; i++) {

            /*if (nums[i] % 2 == 0) {
                continue;
            }
            nums[i] = nums[i] * 2;
*/ // another way

            if (nums[i] % 2 != 0) {
                nums[i] = nums[i] * 2;
            }

        }
        System.out.println(Arrays.toString(nums));

    }
}
/*
write a program that can multiply each odd number of an integer array by 2
                ex:
                    array = [1,2,3,4,5];

                output:
                    array =[2,2,6,4,10]

 */