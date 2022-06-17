package day09_scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 10;
        String numberOfDays;

        switch (month) {
            case 1:
                numberOfDays = "31";
                break;
            case 2:
                numberOfDays = "28";
                break;
            case 3:
                numberOfDays = "31";
                break;
            case 4:
                numberOfDays = "30";
                break;
            case 5:
                numberOfDays = "31";
                break;
            case 6:
                numberOfDays = "30";
                break;
            case 7:
                numberOfDays = "31";
                break;
            case 8:
                numberOfDays = "31";
                break;
            case 9:
                numberOfDays = "30";
                break;
            case 10:
                numberOfDays = "31";
                break;
            case 11:
                numberOfDays = "30";
                break;
            case 12:
                numberOfDays = "31";
                break;
            default:
                numberOfDays = "Invalid number";

        }
        System.out.println("numberOfDays = " + numberOfDays);

        // another way to do it
        switch (month) {
            case 1:// you can put all the case together if result is same
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = "31";
                break;
            case 2:
                numberOfDays = "28";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = "30";
                break;
            default:
                numberOfDays = "Invalid";
        }
        System.out.println("numberOfDays = " + numberOfDays);
    }
}
/*
Create a class named NumberOfDays, an integer variable named month is given, Use switch statement to write a program
that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)

        Hints:
            Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days: 4, 6, 9, 11

 */