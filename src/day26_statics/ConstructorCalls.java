package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(2.6);
        //this();

        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("-----------------------------------------------------------");

        method2();

        System.out.println("-----------------------------------------------------------");


    }

    public static void method1() {
        System.out.println("Method 1");
    }


    public static void method2() {
        method1();
        System.out.println("Method 2");
    }


}

