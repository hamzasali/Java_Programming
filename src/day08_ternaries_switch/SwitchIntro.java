package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'H';
        String result = "0";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println("result = " + result);
        System.out.println("------------------------------------");

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }

    }
}
