package day26_statics;

public class IPhone {

    public static String brand = "Apple"; // static: apple is the brand of all the iphone objects
    public String model;// instance: different models for iphone objects
    public String color;
    public double price;
    public static String OS = "iOS";// static : OS is same for all the iphone objects
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;


    /*public static void printPhoneInfo() {// static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }*/

    public void printPhoneInfo() {
        System.out.println("brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem() {
        System.out.println("Operating System: " + OS);
    }


}
