package day13_customMethods;

import java.util.Scanner;

public class WarmupTask {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 2 numbers and math operator");
//        double n1 = input.nextDouble();
//        double n2 = input.nextDouble();
//        char operator = input.next().charAt(0);
//        calculate(n1, n2, operator);

        calculate(23, 8.98, '+');
        calculate(12.43, 43, '*');
        System.out.println("---------------------");
        ageGroup(20);
        ageGroup(155);
        System.out.println("---------------------");
        eligibleToVote(32, true);
        eligibleToVote(45, false);
    }


    public static void calculate(double num1, double num2, char mathOperator) {


        if (mathOperator == '+') {
            System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
        } else if (mathOperator == '-') {
            System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
        } else if (mathOperator == '*') {
            System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
        } else if (mathOperator == '/') {
            System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Invalid Char");
        }

    }

/*
    Create a method named calculate that can take three arguments:
    num1 (double)
    num2 (double)
    mathOperator (char)

    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

    Ex:
    calculate(10, 20, '+')

    output:
            10 + 20 = 30
*/


    public static void ageGroup(int age) {
        if (age >= 0 && age <= 150) {
            if (age < 21) {
                System.out.println("Teenager");
            } else if (age >= 21 && age < 55) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
        } else {
            System.out.println("Invalid age: " + age);
        }
    }

/*
    Create a method named ageGroup that can print the age group of the person

        age groups are:
                Teenager (< 21)
                Adult   (>=21 && <55 )
                Senior  ( > 55 )
*/
    public static void eligibleToVote(int age, boolean isUsCitizen){
        if(age>=18 && isUsCitizen == true){
            System.out.println("You are Eligible to vote");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
