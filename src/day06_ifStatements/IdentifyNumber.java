package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 210;

        boolean positive = number > 0;// if number is greater than 0 then it is positive
        boolean negative = number < 0;// if number is less than 0 then it is negative.
        //boolean zero = number == 0;// if number is equal to 0 then it is zero.
        boolean zero = !positive && !negative;// if number is not positive AND not negative then it's zero.

        System.out.println(number + " is positive number: " + positive);
        System.out.println(number + " is negative number: " + negative);
        System.out.println(number + " is zero number: " + zero);

    }
}
/*
 Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */