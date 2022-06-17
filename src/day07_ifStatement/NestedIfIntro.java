package day07_ifStatement;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 98;

        //Nested IF STATEMENT
        if (score >= 0 && score <=100){
            if (score >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        System.out.println("-----------------------------------------------------");

        int age = 12;

        if(age>0 && age<=150){
            if(age >= 121){
                System.out.println("Eligible");
            }else{
                System.out.println("Not Eligible");
            }
        }else{
            System.out.println("Invalid Age");
        }
        System.out.println("------------------------------------------------");


    }
}
