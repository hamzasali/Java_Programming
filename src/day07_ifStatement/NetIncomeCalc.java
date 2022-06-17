package day07_ifStatement;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 140000;
        double tax = 0;
        boolean isMarried = true;


        if (salary >= 130000) {
            tax = 0.35;
        }
        if (salary >= 100000 && salary < 130000) {
            tax = 0.30;
        }
        if (salary >= 80000 && salary < 100000) {
            tax = 0.25;
        }
        if (salary < 80000) {
            tax = 0.20;
        }
        if (isMarried) {
            tax = tax - 0.05;
        }
        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("tax = " + tax);
        System.out.println("isMarried = " + isMarried);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                    if the person is married, he/she will pay 5% less tax
 */