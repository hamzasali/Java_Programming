package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition; ){ // since the condition is false it will never run
            System.out.println("Hello Cydeo (for loop)");
        }

        while(condition){
            System.out.println("Hello Cydeo (while loop)");
        }

        do{
            System.out.println("Hello Cydeo (do while loop)");
        }while (condition);


    }
}
