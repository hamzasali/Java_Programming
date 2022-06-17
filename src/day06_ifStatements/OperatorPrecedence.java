package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(4 + 5 * 6);
        //                  4 + 30 = 34
        System.out.println(4 + 3 - 2 / 2);
        //                 4 + 3 - 1
        System.out.println(-5 + 2);
        //      negative 5 will go first
        System.out.println(!true == false);
        //                  false = false
        System.out.println(10 > 9 == 8 < 7 && "Java" == "Python || 'a' == 'a'");
        //
        System.out.println(100 >= 20 && 40 * 2 > 60);
        //                 100 >= 20 &&   80   > 60
        //                    true   &&    true
        //                          true

        int a = 20;

        a +=10 + 2 * 3;
        // a += 10 + 6
        // a += 16
        // a = 36
        System.out.println(a);


    }
}
