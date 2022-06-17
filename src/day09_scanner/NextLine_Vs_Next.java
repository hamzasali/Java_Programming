package day09_scanner;

import java.util.Scanner;

public class NextLine_Vs_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = input.nextInt();

        input.nextLine();// this can erase all the saved data in scanner

        System.out.println("Enter Your Full Name:");
        String name = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);

        input.close();
    }
}
