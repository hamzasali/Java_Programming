package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] arr3 = new int[arr1.length + arr2.length]; // set the size to length of 1st and 2nd array together

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { // i: first array's index number
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {// i: second array's index number
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));
        System.out.println("------------------------------------------------");

        int[] a1 = {12, 23, 34, 45, 56, 67, 78,};
        int[] a2 = {89, 1, 12, 13};

        int[] a3 = ArraysUtility.merge(a1, a2);

        System.out.println(Arrays.toString(a3));
        System.out.println("------------------------------------------------");

        double[] b1 = {12.1, 23.2, 34.3, 45.4, 56.5};
        double[] b2 = {67.6, 78.7, 89.8, 90.9};

        double[] b3 = ArraysUtility.merge(b1, b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("------------------------------------------------");


        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'d', 'e', 'f'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));
        System.out.println("------------------------------------------------");

        String[] str1 = {"Hello", "What's up"};
        String[] str2 = {"How's everything"};

        String[]str3= ArraysUtility.merge(str1, str2);

        System.out.println(Arrays.toString(str3));

    }
}
/*
write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */