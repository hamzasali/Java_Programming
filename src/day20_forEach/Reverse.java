package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length];
        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {
            reverse[k] = array[i];
        }

        System.out.println(Arrays.toString(reverse));


        System.out.println("---------------------------------------------------");


        int[] nums = {100, 200, 300, 400};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------------------------------------");

        double[] a1 = {1.0, 2.0, 3.0, 4.0};
        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));
        System.out.println("---------------------------------------------------");

        String[] str1 = {"Hello", "What's up"};
        str1 = ArraysUtility.reverse(str1);

        System.out.println(Arrays.toString(str1));
        System.out.println("---------------------------------------------------");


    }

}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */