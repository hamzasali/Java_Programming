package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(51);
        nums.add(93);
        nums.add(36);
        nums.add(62);
        nums.add(53);

        int sum = 0;

        for (Integer each : nums) {
            sum += each;
        }

        double ave = sum / (double) nums.size();

        System.out.println(ave);
    }
}
/*
Write a program that can find the average number from an arrayList of integers
 */