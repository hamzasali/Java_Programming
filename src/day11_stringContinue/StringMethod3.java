package day11_stringContinue;

public class StringMethod3 {
    public static void main(String[] args) {
        // isEmpty() method

        String word = ""; // if the string is empty not even space it identifies (true or false)

        boolean r1 = word.isEmpty();

        System.out.println(r1);
        System.out.println("---------------------------------------------");
        //-------------------
        // isBlank() method

        String str = "              ";//if the string is empty it identifies (true or false) even if the spaces are there but no words

        boolean r2 = str.isBlank();

        System.out.println(r2);
        System.out.println("---------------------------------------------");
        //-------------------

        // equals() method

        String str1 = "Cydeo";// literal string goes to string pool

        String str2 = new String("Cydeo"); // outside of string pool

        System.out.println(str1.equals(str2));// use equal method to compare string

        System.out.println("---------------------------------------------");
        //-------------------

        // equalsIgnoreCase() method

        String str3 = "Cydeo";// literal string goes to string pool

        String str4 = new String("cyDeo"); // outside of string pool

        System.out.println(str1.equalsIgnoreCase(str2));// use equal ignore method to compare string but don't care
                                                        // about case sensitivity like lowercase or uppercase
        System.out.println("---------------------------------------------");
        //-------------------

        // contains() method

        String students = " Hasan Naran Sumeya Natalie";

        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed" + hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        System.out.println("---------------------------------------------");
        //-------------------
        // startsWith() method

        String name = "Micheal";

        boolean l = name.startsWith("Mi"); // it determines whether what it starts with is true or false
        System.out.println(l);

        String url = "www.apple.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);

        // endsWith() method
        boolean t = url.endsWith(".com");//it determines whether what it ends with is true or false
        System.out.println(t);

        String email = "hamza@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);


    }
}
