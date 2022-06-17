package day09_scanner;
import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Character");
        char ch = input.next().charAt(0);// for char


        System.out.println("Enter your first name:");
        String firstName = input.next();// only print one word
        input.nextLine();
        System.out.println("Enter your Full Name:");
        String fullName= input.nextLine(); // print full line

        System.out.println("firstName = " + firstName);
        System.out.println("ch = " + ch);
        System.out.println("fullName = " + fullName);

        input.close();




    }
}
