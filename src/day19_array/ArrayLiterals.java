package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        int[] nums = {1, 2, 3, 4, 5}; // Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = 1;
//        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n - 1]);

        System.out.println("----------------------------------------------");


        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int num = 1;
//        int num = new Scanner(System.in).nextInt();

        System.out.println(months[num - 1]);


    }
}
