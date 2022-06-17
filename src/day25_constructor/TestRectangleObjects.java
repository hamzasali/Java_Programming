package day25_constructor;

public class TestRectangleObjects {
    public static void main(String[] args) {

//        Rectangle rectangle1 = new Rectangle();
//        rectangle1.setInfo(4, 5);
//
//        Rectangle rectangle2 = new Rectangle();
//        rectangle2.setInfo(3, 5);
//
//        Rectangle rectangle3 = new Rectangle();
//        rectangle3.setInfo(4, 6);
//
//        Rectangle rectangle4 = new Rectangle();
//        rectangle4.setInfo(9, 5);
//
//        Rectangle rectangle5 = new Rectangle();
//        rectangle5.setInfo(4, 2);

        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(7, 3);
        Rectangle rectangle3 = new Rectangle(5, 3);
        Rectangle rectangle4 = new Rectangle(7, 9);
        Rectangle rectangle5 = new Rectangle(8, 4);


        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);


    }

}
