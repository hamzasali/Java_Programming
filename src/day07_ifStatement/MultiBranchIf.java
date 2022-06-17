package day07_ifStatement;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 1000;
        String result = "";
        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println("result = " + result);
    }
}
