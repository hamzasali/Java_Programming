package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Alena";
        myGroup[myGroup.length - 1] = "Esmira";
        myGroup[2] = "Marika";
        myGroup[1] = "Mizgin";
        myGroup[3] = "Sabina";


        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Sergiy";

        System.out.println(Arrays.toString(myGroup));
        System.out.println("---------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }
        System.out.println("---------------------------------");


        for (int i = 0; i < myGroup.length; i++) {

        }
        for (int i = myGroup.length - 1; i >= 0; i--) {

        }
        System.out.println("---------------------------------");





    }
}
