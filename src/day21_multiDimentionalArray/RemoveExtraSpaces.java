package day21_multiDimentionalArray;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String[] word = str.split(" ");

        str = "";

        for (String each : word) {
            if (!each.isEmpty()) {
                str += each+" ";
            }
        }
        System.out.println(str.trim());
    }
}
/*
Write a program that can remove all the extra space from string
            Ex:
                str = "  Hello world      I      love      Java    "

            Output:
                Hello world I love Java
 */