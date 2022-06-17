package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible(133);
        System.out.println(multiplication(32,5));
    }

    public static void eligible(int age) {
        if (age < 0 || age > 150) {
            System.err.println("Invalid Age");
            return;//exit the method
            //if the age is invalid, then this method get terminated
        }
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;// return the data
    }

}
