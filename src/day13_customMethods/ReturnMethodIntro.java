package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total = sum(20, 40);// sum is void method, does not return any data

        int total = addition(10, 20);// with return method you can return any data

        System.out.println(total + 54);
        System.out.println("-----------------------------");

        System.out.println(square(5));
    }

/*    public static void sum(int n1, int n2) {
        int result = n1 + n2;
    }*/

    public static int addition(int n1, int n2) {

        int result = n1 + n2;

        return result;
    }

    public static int square(int num) {
        int square = num * num;
        return square;
    }


}
