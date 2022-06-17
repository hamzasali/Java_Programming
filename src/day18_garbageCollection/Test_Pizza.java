package day18_garbageCollection;

public class Test_Pizza {
    public static void main(String[] args) {


        //test with if statement of pizza custom class
        /*Pizza pizza1 = new Pizza();

        pizza1.size = 'S';
        pizza1.numberOfCheeseTopping = 3;
        pizza1.numberOfPepperoniTopping = 3;

        System.out.println(pizza1);
        System.out.println(pizza1.calcCost('S', 3, 3));
        System.out.println("---------------------------------------------------------------");

        Pizza pizza2 = new Pizza();
        pizza2.size = 'M';
        pizza2.numberOfCheeseTopping = 6;
        pizza2.numberOfPepperoniTopping = 0;

        System.out.println(pizza2);
        System.out.println(pizza2.calcCost(pizza2.size, pizza2.numberOfCheeseTopping, pizza2.numberOfPepperoniTopping));
        System.out.println("---------------------------------------------------------------");

        Pizza pizza3 = new Pizza();
        pizza3.size = 'L';
        pizza3.numberOfCheeseTopping = 6;
        pizza3.numberOfPepperoniTopping = 6;

        System.out.println(pizza3);
        System.out.println(pizza3.calcCost(pizza3.size, pizza3.numberOfCheeseTopping, pizza3.numberOfPepperoniTopping));
        System.out.println("---------------------------------------------------------------");

        Pizza pizza4 = new Pizza();
        pizza4.size = 'X';
        pizza4.numberOfCheeseTopping = 6;
        pizza4.numberOfPepperoniTopping = 6;

        System.out.println(pizza4);
        System.out.println(pizza4.calcCost(pizza4.size, pizza4.numberOfCheeseTopping, pizza4.numberOfPepperoniTopping));
*/

        Pizza pizza1 = new Pizza();

        pizza1.size = 'S';
        pizza1.numberOfCheeseTopping = 3;
        pizza1.numberOfPepperoniTopping = 3;

        System.out.println(pizza1);
        System.out.println(pizza1.calcCost());
        System.out.println("---------------------------------------------------------------");

        Pizza pizza2 = new Pizza();
        pizza2.size = 'M';
        pizza2.numberOfCheeseTopping = 6;
        pizza2.numberOfPepperoniTopping = 0;

        System.out.println(pizza2);
        System.out.println(pizza2.calcCost());
        System.out.println("---------------------------------------------------------------");

        Pizza pizza3 = new Pizza();
        pizza3.size = 'L';
        pizza3.numberOfCheeseTopping = 6;
        pizza3.numberOfPepperoniTopping = 6;

        System.out.println(pizza3);
        System.out.println(pizza3.calcCost());
        System.out.println("---------------------------------------------------------------");

        Pizza pizza4 = new Pizza();
        pizza4.size = 'X';
        pizza4.numberOfCheeseTopping = 6;
        pizza4.numberOfPepperoniTopping = 6;

        System.out.println(pizza4);
        System.out.println(pizza4.calcCost());
        System.out.println("---------------------------------------------------------------");

        Pizza pizza5 = new Pizza();
        pizza5.setInfo('m', 5, 6);
        System.out.println(pizza5);
        System.out.println("---------------------------------------------------------------");

        System.out.println("-------------------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();

        }


        System.out.println("total = " + total);



    }
}