package day14_forLoop;

public class MethodOverLoadingPractice {

    public static void main(String[] args) {
        System.out.println(sum(3, 4, 7, 1));
        System.out.println(sum(1,7,7));
        System.out.println(sum(56,86));

        System.out.println(sum(2.3, 4.6, 4.5));

    }
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static int sum(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }
    public static double sum(double n1, double n2, double n3, double n4) {
        return n1 + n2 + n3 + n4;

    }
    public static double sum(double n1, double n2, double n3) {
        return n1 + n2 + n3 ;

    }
    public static double sum(double n1, double n2) {
        return n1 + n2;
    }
}
