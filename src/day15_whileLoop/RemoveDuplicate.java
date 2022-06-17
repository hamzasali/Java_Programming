package day15_whileLoop;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "dkkjdk";
        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: represents the index number of the given string str
            char each = str.charAt(i); // each character of string str
            if (!result.contains("" + each)) { // if the string result does not contain character of string str yet
                result += each; // then we will enter the character to string result
            }
        }
        System.out.println("result = " + result);

    }
}
