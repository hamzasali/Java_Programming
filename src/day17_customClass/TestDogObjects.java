package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 2;
        dog1.size = "Large";
        dog1.color = "Gray";

        dog1.eat();
        dog1.drink();

        System.out.println(dog1);
        System.out.println("--------------------");
        Dog dog2 = new Dog();

        dog2.name = "Chubby";
        dog2.breed = "German Shepherd";
        dog2.gender = 'M';
        dog2.age = 5;
        dog2.size = "Medium";
        dog2.color = "Brown";

        dog2.eat();
        dog2.drink();

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("loki", "chow chow", "small" +
                "", 'M', 2, "white");
        System.out.println(dog3);


    }
}
