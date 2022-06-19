package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;
    public LocalDate hired_Date;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hired_Date = hiredDate;
    }// allows us to set all the instance variable of the objects as soon as the objects is created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hiredDate=" + hired_Date.format(DateTimeFormatter.ofPattern("MMMM/dd/yy")) +
                '}';
    }
}
