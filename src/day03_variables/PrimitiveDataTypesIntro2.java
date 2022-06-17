package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args){

        //DataType VariableName = Data
        //char
        char a = 'a';// char only accept single character
        char b = 'b';
        //char c = 'as';// char doesn't accept more than one character
        System.out.println(a);
        System.out.println(b);
        System.out.println("-------------------");

        char ch1 = 'A';
        char ch2 = 65; // char can understand number from ascii table.
        char ch3 = 123;// every single character has number that can be used
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println("------------------------");



        //Boolean doesn't accept any other variable type
        //boolean r1 = 123;
        //boolean r2 = 2.5;
        //boolean r3 = "Java";
        //boolean r4 = 'A';

        boolean r5 = true;// boolean only accept true or false expression
        boolean r6 = false;
        boolean r7 = 12>23;// boolean only accept expression related to true or false
        boolean r8 = 23>12;

        System.out.println(r7);
        System.out.println(r8);





    }

}
