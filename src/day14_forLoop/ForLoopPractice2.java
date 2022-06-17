package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number " + (i + 1));
            int num = input.nextInt();
        }
        System.out.println("---------------------------------------");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");// used scanner in the for loop
            sum += input.nextInt();
        }

        System.out.println(sum);
    }

    //write a program that can ask the user to enter number find maximum
}
