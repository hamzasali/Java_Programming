package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0) { //if i is even
                continue; // skip
            }

            System.out.println(i);
        }

        for (char i = 'A'; i <= 'G'; i++) {
            if (i == 'B') {
                continue;
            }
            if (i == 'E') {
                continue;
            }
            System.out.println(i);
        }





    }
}
