package day09_scanner;

import java.util.Scanner; // just import scanner
//import java.util.*; //this imports everything and use more memory

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// this is need for user input

        System.out.println("Enter your first Number:");
        byte num1 = keyboard.nextByte();

        System.out.println("Enter your second Number: ");
        short num2 = keyboard.nextShort();

        System.out.println("Enter your third Number:");
        int num3 = keyboard.nextInt();

        System.out.println("Enter your forth Number:");
        long num4 = keyboard.nextLong();

        keyboard.close();// scanner is closed. user can't enter anything after that

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


    }

}
