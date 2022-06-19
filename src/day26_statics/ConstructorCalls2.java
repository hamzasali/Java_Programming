package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2() {

        System.out.println("Default");

    }

    public ConstructorCalls2(int a) {
        this();
        System.out.println("int arg");

    }

    public ConstructorCalls2(String a) {
        this(5);
        System.out.println("String arg");

    }

    public static void main(String[] args) {

        ConstructorCalls2 ojb1 = new ConstructorCalls2();
        System.out.println("-----------------------------------------------------------");
        ConstructorCalls2 ojb2 = new ConstructorCalls2(12);
        System.out.println("-----------------------------------------------------------");
        ConstructorCalls2 ojb3 = new ConstructorCalls2("a");

    }

}
