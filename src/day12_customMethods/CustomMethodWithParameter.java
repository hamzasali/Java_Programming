package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {
        oddOrEven((2 + 2 + 3) * 0);
        oddOrEven(234);
        oddOrEven(9812 + 24);
        System.out.println("---------------------------");

    }

    // to find odd or even number method
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }




}
