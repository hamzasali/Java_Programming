package day06_ifStatements;

public class ifStatementIntro {
    public static void main(String[] args) {

        int number = 0;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
// you can make  boolean expression if you want or just put the boolean expression directly in the if statement

        if (isPositive) {
            System.out.println(number + " is positive number");
        }
        if (isNegative) {
            System.out.println(number + " is negative number");
        }
        if (isZero) {
            System.out.println(number + " is zero.");
        }
        System.out.println("---------------------------------------");

        int num = 3;

        if (num > 0) {
            System.out.println(num + " is positive");
        }
        if(num < 0){
            System.out.println(num + " is negative");
        }
        if(num == 0){
            System.out.println(num + " is zero");
        }

    }
}
