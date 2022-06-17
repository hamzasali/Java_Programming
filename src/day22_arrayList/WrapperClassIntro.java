package day22_arrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {

        String str = "Java";

        int a1 = 10;
        Integer a2 = a1;

        System.out.println("-----------------------------------------");

        int b1 = 100;

        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1; // auto boxing
        //Long b3 = (long)b1;

        char ch = 'A';
        Character ch1 = ch;

        double d1 = 5.5;
        Double d2 = d1;

        System.out.println("---------------------------------------------------");

        Integer n1 = 20;

        int n2 = n1; // unboxing
        //long n3 = n1;
        //double n4 = n1;

        Character e1 = 'Z';

        char e2 = e1;

        //int e3 = e1;

    }

}
