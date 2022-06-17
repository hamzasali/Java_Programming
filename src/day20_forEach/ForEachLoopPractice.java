package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            if (each % 2 == 0) {
                continue;
            }
            System.out.println(each);
        }
        System.out.println("---------------------------------------------------------");

        int[] nums = {1, 34, 56, 678, 798, 54, 32};

        int max = nums[0];
        int min = nums[0];
        for (int each : nums) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------");

        int[] a1 = {1, 2, 3, 43, 4, 43, 3};
        int[] a2 = {23, 43, 54, 45, 3, 2};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }
        for (int each : a2) {
            a3[k++] = each;
        }
        System.out.println(Arrays.toString(a3));
        System.out.println("--------------------------------------------------");


        String[] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));
        }


    }
}

