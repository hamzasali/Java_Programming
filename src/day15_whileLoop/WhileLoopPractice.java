package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 150)) {
            System.out.println("Invalid age, re-enter:");
            age = input.nextInt();
        }
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        input.close();

    }
}
