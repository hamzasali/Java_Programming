package day25_constructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/yy");
        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(12, 55);

        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EE, MMM/dd/y hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));


    }
}
