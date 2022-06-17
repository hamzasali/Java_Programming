package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args){

        // Implicit Casting

        byte a = 15;

        short b = a; // smaller type to larger type

        int c = a; // in implicit casting you can assign small primitive type to large

        double d = c; //assign automatically from small to large

        System.out.println(c);


        //Explicit Casting

        double e = 10.0;

        float f = (float)e; // larger type to smaller type

        int g = (int)e; // in explicit casting you can assign large primitive type to small

        int x = 127;

        byte y = (byte)x; //assign manually from small to large


        System.out.println(g);
        System.out.println(y);


    }

}
