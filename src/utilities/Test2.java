package utilities;

//import day27_accessModifiers.Data;

//import static day27_accessModifiers.Data.d;// specific static member

//import static day27_accessModifiers.Data.method3;

import static day27_accessModifiers.Data.*; // all static members in that class


public class Test2 {
    public static void main(String[] args) {

        System.out.println(d);
        method3();

        System.out.println(e);
        System.out.println(f);

        method4();
        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();
        */// you can't call objs
    }
}
