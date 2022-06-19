package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Hamza", 23, 'M', "Developer", 123000, LocalDate.of(2021, 12, 4));

        System.out.println(employee1);

    }
}
