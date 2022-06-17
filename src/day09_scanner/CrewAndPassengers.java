package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int totalPeople = 71;
        //else if ternary
        String passengersAndCrew = (totalPeople == 50) ? "20 crew, 30 passengers" : (totalPeople == 75) ?
                "25 crew, 50 passengers" : (totalPeople == 100) ? "30 crew, 70 passengers" : "Not Valid";
        System.out.println("passengersAndCrew = " + passengersAndCrew);
        System.out.println("--------------------------------------------------------------------");


        totalPeople = 100;
        //nested else if ternary
        String result1 = (totalPeople == 50 || totalPeople == 75 || totalPeople == 100) ?
                (totalPeople == 50) ? "20 crew, 30 passengers"
                        : (totalPeople == 75) ? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                : "Invalid";
        System.out.println(result1);
        System.out.println("--------------------------------------------------------------------");


        //Switch Statement
        totalPeople = 50;
        String passengersAndCrew1;

        switch (totalPeople) {

            case 50:
                passengersAndCrew1 = "20 crew, 30 passengers";
                break;
            case 75:
                passengersAndCrew1 = "25 crew, 50 passengers";
                break;
            case 100:
                passengersAndCrew1 = "30 crew, 70 passengers";
                break;
            default:
                passengersAndCrew1 = "Invalid Number";
                break;
        }
        System.out.println(passengersAndCrew1);
    }
}
/*
Create a class named CrewAndPassengers1
        Given a number of people on the ship (int number)
        determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

        Solution1: Use ternary. Do not use more than one println()
        Solution2: Use switch statement. Do not use more than one println()

 */