package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 23;

        boolean even = number % 2 == 0;// if number divide by 2 and remainder is 0, it is even
        //boolean odd = number % 2 != 0;// if number divide by 2 and remainder is not 0, it is odd
        boolean odd = !even; // if the number is NOT even then it's odd
        // you can write it either way

        System.out.println(number + " is an even number: " + even);
        System.out.println(number + " is an odd number: " + odd);


    }
}
/*
Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
            Ex:
                number = 20
            output:
                20 is an even number: true
                20 is an odd number: false
        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */