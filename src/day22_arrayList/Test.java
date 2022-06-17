package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 5, 6};

        System.out.println(ArraysUtility.contains(numbers, 5));
        System.out.println("--------------------------------------");
        String[] str = {"Apple", "Orange"};

        System.out.println(ArraysUtility.contains(str, "apple"));



    }
}