package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("------------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60, 50};
        numbers = ArraysUtility.addElement(numbers, 40);
        System.out.println(Arrays.toString(numbers));

        double[] nums = {1.1, 2.2, 3.3, 4.4, 5.5};
        nums = ArraysUtility.addElement(nums, 6.6);
        System.out.println(Arrays.toString(nums));
    }
}
