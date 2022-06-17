package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args){

        //DataType VariableName = Data
        //byte a = "Java"; // byte can only accept integer num (-128 to 127)
        //byte a = 11.2; // byte can't accept decimals
        //byte a = 2000; // byte only accept numbers between -128 and 127
        byte a = 123;

        // short data type accepts number between -32768 to 32767
        //short s = 50500;
        // price of car is $19800
        short car = 19800;

        // int data type is preferred in Java for integer numbers

        int price = 150000;

        // long data type is very rarely used. you have to use L at the end of number
        long l = 12345678912345L;

        System.out.println(a);
        System.out.println(car);
        System.out.println(l);
        System.out.println(price);
        System.out.println("------------------------------------------");

        //Double and float data types are used for decimal numbers

        double gpa1 = 2.8; // double is the preferred data type for decimals
        float gpa2 = 2.2f;

        System.out.println(gpa1);
        System.out.println(gpa2);



    }
}
