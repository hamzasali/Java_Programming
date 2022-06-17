package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Khashayar Shayesteh", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Boban Milosevic", 'M', LocalDate.of(1969, 2, 25));
        people[2].setInfo("Tatiana Seremet", 'F', LocalDate.of(1993, 2, 25));
        people[3].setInfo("Mohammad Karimi", 'M', LocalDate.of(1995, 2, 25));
        people[4].setInfo("Ali", 'M', LocalDate.of(1965, 2, 25));


        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));


        studentList.removeIf(p -> p.age > 55);

        System.out.println(studentList.size());

    }
}
