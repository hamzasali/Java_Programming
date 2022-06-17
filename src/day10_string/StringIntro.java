package day10_string;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = "cat";// String pool is inside heap
        String s2 = "dog";// object that you create will be save in heap

        String s3 = "cat";// doesn't matter how many times you create new objects as long as they are same
        String s4 = "cat";// they will be save as one in string pool

        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        System.out.println("------------------------------------");

        String str1 = new String("Java");//using "new" keyword make new word in heap
        String str2 = new String("Java");

        System.out.println(str1==str2);
        System.out.println("------------------------------------");


    }

}
