package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // && means AND. in && logic all conditions must be true
        double salary = 35000;
        int creditScore = 700;
        int age = 23;
        //all conditions has to be true to get true
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan);

        double salary1 = 55000;
        int creditScore1 = 600;
        int age1 = 33;

        // if one condition is false, it will be false in the end
        boolean eligibleForLoan1 = salary1 >= 40000 && creditScore1 >= 620 && age1 >=21;
        System.out.println(eligibleForLoan1);

        System.out.println("______________________________________________________");


        // || means OR. atLease on condition has to be true to get true
        int age2 = 16;
        String country = "USA";

        boolean toVote = age2 >= 18 || country == "USA";

        System.out.println(toVote);

        System.out.println("______________________________________________________");

        System.out.println(!true);

        String a ="yes";
        boolean yes = a == "yes";
        boolean no = !yes;

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("______________________________________________________");

        int score = 65;

        boolean passed = score>= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("______________________________________________________");

        System.out.println("");





    }
}
