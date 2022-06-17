package day07_ifStatement;

public class IfStatementWithOutCurlyBraces {
    public static void main(String[] args) {

        int age = 12;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        System.out.println("----------------------------------------------------------------");

        if (age >= 21) System.out.println("Eligible");
        else System.out.println("Not Eligible");
        System.out.println("----------------------------------------------------------------");

        int day = 2;

        if (day == 1) System.out.println("MON");
        else if (day == 2) System.out.println("TUE");
        else if (day == 3) System.out.println("WED");
        else if (day == 4) System.out.println("THUR");
        else if (day == 5) System.out.println("FRI");
        else if (day == 6) System.out.println("SAT");
        else System.out.println("SUN");

    }

}
