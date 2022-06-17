package day07_ifStatement;

public class LoanApplication {
    public static void main(String[] args) {

        //single if
        int salary = 35000;
        int score = 800;
        String result = "";

        if (salary >= 45000 && score >= 700) {
            result = "Eligible";
        }
        if (salary >= 45000 && score < 700 || salary < 45000 && score >= 700) {
            result = "Not Eligible";
        }

        System.out.println("You are " + result + " for loan.");
        System.out.println("------------------------------------");

        //if else
        salary = 65000;
        score = 820;
        result = "";
        if (salary >= 45000 && score >= 700) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }

        System.out.println("result = " + result);

    }
}
/*
Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */