package day12_customMethods;

public class Test {
    public static void main(String[] args) {

        int number = 390;
        //to call method from different class

        // class name           . method name
        CustomMethodWithParameter.oddOrEven(390);

        String firstName = "Abu";
        String lastName = "Hassan";

      // class name         . method name
        CustomMethodPractice.nameInitials(firstName, lastName);
    }
}
