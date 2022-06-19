package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployeed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployeed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployeed = isEmployeed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployeed=" + isEmployeed +
                '}';
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleeping() {
        System.out.println(name + " is sleeping right now");
    }
}
/*
name, age, gender, isMarried, isEmployeed
Add a constructor that can set all the fields once an object is created
toString(), eat(String food), sleeping(), drink(String drink)
 */