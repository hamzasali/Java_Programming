package day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

//        String[] s1 = str1.split("");
//        System.out.println(Arrays.toString(s1));
//        String[] s2 = str2.split("");
//        System.out.println(Arrays.toString(s1));
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println("isAnagram = " + isAnagram);
    }
}

