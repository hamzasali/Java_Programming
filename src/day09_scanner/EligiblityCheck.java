package day09_scanner;

import java.util.Scanner;

public class EligiblityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age =input.nextInt();

        if(age >=21 && age <=100){
            System.out.println("You are Eligible to but Alcohol");
        }else{
            System.out.println("You are not Eligible to buy Alcohol");
        }
        input.close();
    }
}
