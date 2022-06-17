package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);
        a = 21; // you can change the value of variable anytime
        System.out.println(a);
        a = 43;// after the value is changed. called value will be new one
        System.out.println(a);
        System.out.println("-------------------------");

        double balance = 200;
        System.out.println(balance);
        balance += 1540; // balance = 200 + 1540
        System.out.println(balance);
        balance += 35.34;// add any number or value to original value
        System.out.println(balance);
        System.out.println("--------------------------");

        balance -= 293; // balance = 1775.34 - 293
        System.out.println(balance);
        balance -= 500;// minus/decrease any number or value to original value
        System.out.println(balance);
        System.out.println("--------------------------");

        double salary = 45000;
        salary *= 2;// salary = 45000 * 2

        System.out.println(salary);
        salary *= 1.5; // multiply with original value
        System.out.println(salary);
        System.out.println("--------------------------");

        System.out.println(salary);
        salary /= 2; //divide the value
        System.out.println(salary);
        System.out.println("--------------------------");

        int b = 9;

        b %= 2;

        System.out.println(b);



    }
}
