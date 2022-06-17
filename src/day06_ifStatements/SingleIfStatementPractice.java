package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
        int number = 43;

        boolean isEven = number % 2 == 0;
        if(isEven){
            System.out.println("Is even");
        }
        if(!isEven){
            System.out.println("Odd Number");
        }

        System.out.println("------------------");

        if(number % 2 == 0){
            System.out.println("Is even");
        }

        if(number % 2 != 0){
            System.out.println("Odd Number");
        }




    }
}
