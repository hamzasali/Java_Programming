package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    //with if statement
   /* public double calcCost(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        double price = 0;
        if (this.size == 'S' || this.size == 's') {
            price = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        } else if (this.size == 'M' || this.size == 'm') {
            price = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        } else if (this.size == 'L' || this.size == 'l') {
            price = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        } else {
            System.out.println("Invalid pizza size");
        }
        return price;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Price=" + calcCost(size, numberOfCheeseTopping, numberOfPepperoniTopping) +
                '}';
    }
    */

    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.out.println("Invalid size: "+size);

        }

        return totalPrice;
    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }


}
/*
Create a class named Pizza:
            Attributes:
                1. size
                2. numberOfCheeseTopping
                3. numberOfPepperoniTopping

            Actions:
                calcCost(): returns the total cost of the pizza
                toString():returns a String containing the pizza size, quantity of each topping,
                 and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */