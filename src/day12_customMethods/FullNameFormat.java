package day12_customMethods;

import java.util.Scanner;

public class FullNameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name:");
        String firstName = input.next();
        //String firstName = input.nextLine().trim().replace(" ","");
        // it is used if user enter spaces before
        // or in between names letters
        System.out.println("Enter Last name:");
        String lastName = input.next();
        //String lastName = input.nextLine().trim().replace(" ","");

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //          first character to upper case           + rest to lower case
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

        // another way to do it
        /*String firstCh = firstName.substring(0, 1).toUpperCase();
        String lastCh = lastName.substring(0, 1).toUpperCase();

        String firstNameLower = firstName.substring(1).toLowerCase();
        String lastNameLower = lastName.substring(1).toLowerCase();

        System.out.println(firstCh + firstNameLower+" "+lastCh + lastNameLower);*/
        input.close();
    }
}
