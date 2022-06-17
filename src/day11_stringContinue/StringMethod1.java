package day11_stringContinue;

public class StringMethod1 {
    public static void main(String[] args) {

        // toLowerCase() method

        String str1 = "JAVA PROGRAMMING";

        str1 = str1.toLowerCase();// change to lowercase

        System.out.println(str1);

        System.out.println("--------------------------------------------");
        //--------------------------------------------

        // toUpperCase() method

        String str2 = "java programming";
        str2 = str2.toUpperCase(); // change to UPPERCASE

        System.out.println(str2);

        System.out.println("--------------------------------------------");
        //-------------------------------------------

        String word = "Wooden Spoon";
        word = word.toUpperCase();

        word = word.toLowerCase();

        System.out.println(word);

        System.out.println("--------------------------------------------");
        //-------------------------------------------

        // trim() method
        String str4 = "           Cydeo School                   ";
        str4 = str4.trim();// remove white spaces in string

        System.out.println(str4);

        System.out.println("--------------------------------------------");
        //-------------------------------------------

        //indexOf() method
        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('s');// to find the index number starts from left
        System.out.println(index1);
        System.out.println("-----");

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a');

        System.out.println(firstA);
        System.out.println("-----");

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);
        System.out.println("-----");

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);
        System.out.println("-----");

        int a3 = s2.indexOf("avaScript");
        System.out.println(a3);
        System.out.println("-----");

        int a4 = s2.indexOf("aS");
        System.out.println(a4);
        System.out.println("-----");
        System.out.println("--------------------------------------------");
        //-------------------------------------------
        // lastIndexOf() method

        String w = "Java";

        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));//to find the index number starts from right

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));


    }
}
