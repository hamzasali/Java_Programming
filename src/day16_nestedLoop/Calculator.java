package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        double result = 0;
        while (answer.equals("yes")) {
            System.out.println("Enter a first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter a math operator");
            char operator = input.next().charAt(0);

            while (!(operator == '*' || operator == '/' || operator == '+' || operator == '-')) {
                System.err.println("Invalid math operator, enter again");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter a second number:");
            double num2 = input.nextDouble();

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else {
                result = num1 * num2;
            }

            System.out.println("Result " + result);

            System.out.println("Would you like to continue? (Yes/No)");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid input, Would you like to continue? (Yes/No) ");
                answer = input.next().toLowerCase();
            }

        }

    }
}
/*
 Write a program for a simple calculator
            1.1 ask the user to enter first number: (double)
            1.2 ask the user to enter a math operator: (-, +, *, /)
                if the user enters invalid math operator, repeat the same step until user enters a valid operator

            1.3 ask the to enter the second number: (double)
            1.4 display the calculation result
            1.5 Would you like to continue? (Yes/No)
 */