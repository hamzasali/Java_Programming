package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {


        String str = "aabcccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {//check how many times the ch has appeared in str
                if (str.charAt(i) == ch) { // if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }
            if (frequency == 1) { // if the frequency is equal to 1 then it's unique
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}
/*
    Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

        Ex:
        input:
        aabcccd

        output:
        bd

        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
*/
