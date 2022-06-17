package day12_customMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {

        oddEvenZero(23);
        oddEvenZero(0);
        oddEvenZero(98);
        System.out.println("------------------------");
        alcoholBuyEligibilty(45);
        alcoholBuyEligibilty(20);
        System.out.println("-----------------------");
        studentGrade(91);
        studentGrade(81);
        studentGrade(71);
        studentGrade(61);
        studentGrade(59);
        System.out.println("------------------------");
        findMaximumNumber(23, 45);
        findMaximumNumber(25, 9);
        findMaximumNumber(23, 23);
        System.out.println("-------------------------");
        nameInitials("Hamza", "Ali");
    }


    //if a person is eligible to buy alcohol
    public static void alcoholBuyEligibilty(int age) {
        if (age >= 21) {
            System.out.println("You are Eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    //if a number is odd or even or zero
    public static void oddEvenZero(int num) {
        if (num == 0) {
            System.out.println(num + " is Zero");
        } else if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    //calculate the grade of student
    public static void studentGrade(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    //print maximum number between two number, if equal then print equal
    public static void findMaximumNumber(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is maximum");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum");
        } else {
            System.out.println("Both are equal");
        }
    }

    //print Initials of person
    public static void  nameInitials(String firstName, String lastName ) {
        String firstNameInitial = firstName.substring(0, 1).toUpperCase();
        String lastNameInitial = lastName.substring(0, 1).toUpperCase();
        String nameInitials = firstNameInitial + "." + lastNameInitial;
        System.out.println("initials is " +nameInitials);

        //you can do it this way too
        String initials = firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("initials is " + initials);

    }
}
