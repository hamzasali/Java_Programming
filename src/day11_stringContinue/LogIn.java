package day11_stringContinue;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "Cydeo", //declaring variable here means user can change the
                correctPassword = "WoodenSpoon";//  either of the info anytime and it will change in program

        System.out.println("Enter username");
        String username = input.nextLine();
        System.out.println("Enter Password");
        String password = input.nextLine();

        if(username.equals(correctUsername)&& password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }
        input.close();

    }
}
/*
Create a class named LogIn
            2.1 Ask the user to enter the username & password
            2.2 print "You are now logged in" If user entered valid username and password
                otherwise print the error message "Incorrect username or password. Please try again"

            Note: Assume that the valid credentials are:
                        username: Cydeo
                        password: WoodenSpoon
 */