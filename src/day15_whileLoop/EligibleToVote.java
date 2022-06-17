package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid age, Plz enter again");
            age = input.nextInt();
        }

        System.out.println("Are you US Citizen? Yes/No");
        String american = input.next().toLowerCase();

        while (!(american.equals("yes")  || american.equals("no") )) { // answer is neither yes or no
            System.err.println("Invalid, please enter again");
            System.err.println("Are you US Citizen? Yes/No");
            american = input.next().toLowerCase();
        }

        if (age >= 18 && american.equals("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
