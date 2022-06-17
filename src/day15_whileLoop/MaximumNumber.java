package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNum = -2147483648; //minimum number in INT

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num > maxNum ) { // if this condition is true
                maxNum = num; // greater number will be assigned to maximum number
            }
        }
        System.out.println("maxNum = " + maxNum);
        input.close();
    }
}
