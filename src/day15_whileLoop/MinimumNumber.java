package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minNum = 2147483647;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num < minNum) {
                minNum = num;
            }
        }
        System.out.println("minNum = " + minNum);
        input.close();
    }
}
