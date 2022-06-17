package day14_forLoop;

import javax.print.DocFlavor;

public class WarmupTask {
    public static void main(String[] args) {

        System.out.println(combine("hamza", "ali"));
        System.out.println("-------------------------");
        System.out.println(sumOf2Numbers(32, 8));
        System.out.println("-------------------------");
        System.out.println(sumOf3Numbers(5, 10, 5));
        System.out.println("-------------------------");
        System.out.println(sumOf4Numbers(5, 12, 3, 9));
    }

    public static String combine(String w1, String w2) {

        //one way to do it
        String result = "";
        if (w1.endsWith("" + w2.charAt(0))) { // if the first string ends with same first character of the second word
            result = w1 + w2.substring(1);
        } else {
            result = w1 + w2;
        }
        return result;

        // another way to do it
            /*char firstWord = w1.charAt(w1.length() - 1);
        char secWord = w2.charAt(0);

        if (firstWord == secWord) {
            return w1 + "" + w2.substring(1);
        }
        return w1 + "" + w2;*/


    }

    public static int sumOf2Numbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {

        // return num1 + num2 + num3;
        int sum = sumOf2Numbers(num1, num2) + num3;
        return sum;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {

//        return num1 + num2 + num3 + num4; (one way)
//        int sum = sumOf3Numbers(num1, num2, num3) + num4; (another way)
//        return sum;
        return sumOf2Numbers(num1, num2)+sumOf2Numbers(num3 , num4);
    }
}
/*
1. create a method that can find the sum of two integer numbers
                method name: sumOf2Numbers

    2. create a method that can find the sum of three integer numbers
                method name: sumOf3Numbers

    3. create a method that can find the sum of four integer numbers
                method name: sumOf4Numbers
 */