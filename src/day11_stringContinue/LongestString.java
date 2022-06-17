package day11_stringContinue;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Sentences");
        String fs1 = input.nextLine();
        System.out.println("Enter second Sentences");
        String fs2 = input.nextLine();

        if(fs1.length()>fs2.length()){
            System.out.println(fs1);
        } else if (fs1.length()<fs2.length()) {
            System.out.println(fs2);
        }else{
            System.out.println("Equal");
        }
        input.close();

    }
}
/*
Create a class named LongestString
            1.1 Ask the user to enter two strings
            1.2 Write a program that can print the longest string,
             if both have the same number of characters then print "Equal"
 */