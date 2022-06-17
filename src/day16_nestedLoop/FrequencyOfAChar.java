package day16_nestedLoop;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        String str = "aabcccccccccccd";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {//i is index number of str
            if (str.charAt(i) == ch) { //if the character of the string is equal to given character,
                // it means the given character has appeared in string
                count++;
            }
        }
        System.out.println(count);

    }
}
/*Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */