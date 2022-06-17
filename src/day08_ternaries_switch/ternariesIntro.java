package day08_ternaries_switch;

public class ternariesIntro {
    public static void main(String[] args) {
        int score = 98;
        String result = "";

        if (score >= 60) {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("-------------------------");


        // ternary example
        String result2 = score >= 60 ? "passed" : "Failed";
        System.out.println(result2);


        int age = 54;
        String r;
        if (age >= 21) {
            r = "eligible";
        } else {
            r = "Not eligible";
        }
        System.out.println(r);
        System.out.println("----------");

        String age2 = age >= 21 && age<=50 ? "Eligible" : "Not Eligible";
        System.out.println(age2);
    }
}
