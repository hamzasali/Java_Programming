package day19_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int[] scores = new int[5];

        scores[0] = 85;
        scores[1] = 75;
        scores[2] = 78;
        scores[3] = 88;
        scores[4] = 95;

//        scores[5] = 100;
//        scores[-1] = 65;
//
//        scores = new int[10];
//        scores = new int[50];

        System.out.println(Arrays.toString(scores));
        System.out.println(scores[3]);

        System.out.println("-------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("-------------------------------------");


        System.out.println(scores[scores.length-1]);
    }
}
