package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {

        int grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (!isValid) {
            System.out.println("Invalid Grade");
            return;
        }
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Failed");

        }

    }
}
