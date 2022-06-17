package day07_ifStatement;

public class Grade2_elseIf {
    public static void main(String[] args) {
        char grade = 'B';
        String result = "";

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
    }
}
