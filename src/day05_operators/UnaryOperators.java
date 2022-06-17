package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        // pre increment/decrement
        int x = 10;
        System.out.println(++x);// pre increment increase value right away
        System.out.println(x);
        System.out.println(--x);// pre decrement decrease the value right away

        int y = 100;
        System.out.println(--y);// decrement
        System.out.println(y);
        System.out.println(++y); // increment
        System.out.println("------------------------");

        //post increment/decrement

        int a = 50;
        System.out.println(a++); //post increment pass the same value first
        System.out.println(a);// then change the value later from there on

        int b = 12;
        System.out.println(b--);//post decrement pass the same value first
        System.out.println(b);// then change the value later from there on
        System.out.println("-----------------------------------");

        int n = 30;

        int m = n++;

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;

        int q = z--;

        System.out.println("q = " + q);
        System.out.println("z = " + z);

    }
}
