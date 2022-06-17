package day13_customMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(31));
        System.out.println(isEven(34));
        System.out.println(max(32, 65));
        System.out.println(max(54, 22));
        System.out.println(min(32, 12));
        System.out.println(min(34, 98));

    }

    public static boolean isOdd(int num) {
        boolean result = (num % 2 != 0) ? true : false;
        return result;
    }

    public static boolean isEven(int num) {
        boolean result = !isOdd(num);
        return result;
    }

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }
}
