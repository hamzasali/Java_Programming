package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        //System.out.println(a > b);

        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);
        System.out.println("--------------------");


        int score = 56;

        boolean passed = score > 60;// greater than
        System.out.println(passed);
        System.out.println("--------------------");

        int age = 21;

        boolean eligible = age >= 21;// greater or equal than
        System.out.println(eligible);

        System.out.println(100 > 100);//false cuz 100 is not greater than 100 nut equal
        System.out.println(100 >= 100);//true
        System.out.println("--------------------");

        score = 56;
        boolean failed = score < 60; // less than
        System.out.println(failed);
        System.out.println(1000 < 10000); //true
        System.out.println("--------------------");

        System.out.println(91 <= 100);//true
        System.out.println(100 <= 100);//true
        System.out.println("--------------------");

        //System.out.println("Java" <= "C++"); >,<,>=,<= are used in only numbers
        // you can also use with single letter or char too

    }

}
