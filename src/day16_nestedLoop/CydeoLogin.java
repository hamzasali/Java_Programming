package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "Cydeo";
        String password = "WoodenSpoon";


        System.out.println("Enter your username:");
        String givenUsername = input.next();

        System.out.println("Enter your password");
        String givenPassword = input.next();

        if (givenUsername.equals(userName) && givenPassword.equals(password)) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i <= 3; i++) {
                /*if(i!=3){
                    System.err.println("Wrong credentials. Try again ");
                }else {
                    System.err.println("This is your last chance, please re-enter your username and password");
                }*/ // this is extra statement if required

                System.err.println("Wrong credentials. Try again ");
                System.out.println("Enter your username:");
                givenUsername = input.next();
                System.out.println("Enter your password");
                givenPassword = input.next();

                // if user enter valid credentials loop will exit
                if (givenUsername.equals(userName) && givenPassword.equals(password)) {
                    System.out.println("You are now Logged in");
                    break;
                }
            }
            // after all 3 attempts if credentials are still incorrect
            if (!(givenUsername.equals(userName) && givenPassword.equals(password))) {
                System.err.println("Your account is now locked, please contact support");
            }
        }
        input.close();

    }

}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three
                attempts to enter correct credentials and if all three attempts are failed, then print
                "Your account is locked."

 */