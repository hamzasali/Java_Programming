package day11_stringContinue;

public class StringMethod2 {
    public static void main(String[] args) {

        //replace() method
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java"); // replace all the word in string

        System.out.println(sentence);
        System.out.println("-----------------------------------");
        //------------------------

        String word = "java";

        word = word.replace('a', 'A');

        System.out.println(word);
        System.out.println("-----------------------------------");
        //------------------------
        // replaceFirst() method

        String sentence2 = "I love Java, Java is cool";

        sentence2 = sentence2.replaceFirst("Java", "Python"); // replace specific or part word with something

        System.out.println(sentence2);

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java", ", Python");// make it unique if the same word is not first to change

        System.out.println(sentence3);

        System.out.println("-----------------------------------");
        //------------------------
        //substring() method

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1); // portion of string to be made into new string using index numbers

        System.out.println(languageName);

        String sentence5 = "Today is Sunday, Tomorrow is Monday";

        String today =sentence5.substring(9, 14 + 1);
        System.out.println(today);
        System.out.println("-----------------------------------");
        //------------------------
        String email = "gmail@yahoo.com";
        int index1 = email.indexOf('@')+1; // find index
        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1, index2); // finding index and creating substring
        System.out.println(domain);
        System.out.println("-----------------------------------");
        //------------------------

        String sentence6 = "I love Java Programming";

        //String r1 = sentence6.substring(7, sentence6.length());// this is one way to write substring till the end
        String r1 = sentence6.substring(7);

        System.out.println(r1);
        System.out.println("-----------------------------------");
        //------------------------

        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        int s = sentence7.lastIndexOf(' ')+1;
        String tommorow = sentence7.substring(s);

        System.out.println(tommorow);
        System.out.println("-----------------------------------");
        //------------------------

        // repeat() method

        String str = "Python";
        //String result = (str+" ").repeat(10);// repeat however many times you want with spaces by grouping them
        String result = str.repeat(10);// repeat however many times you want
        System.out.println(result);

    }
}
