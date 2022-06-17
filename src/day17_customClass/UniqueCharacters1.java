package day17_customClass;

public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {// checking the two index number at same time
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}

 /*   Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

        Ex:
        input:
        AABCCD

        output:
        BD

        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
*/