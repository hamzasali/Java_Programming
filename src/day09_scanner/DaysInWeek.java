package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day number:");
        int num = input.nextInt();
        String day ="";

        if (num >= 1 && num <= 7) {
            day = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" :
                    (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";
        }else{
            System.out.println("Invalid");
        }
        System.out.println(day);

        input.close();
    }
}
