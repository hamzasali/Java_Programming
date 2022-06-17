package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Todays is " + today);

        LocalDate birthDay = LocalDate.of(1998, 10, 21);

        System.out.println(birthDay);

        System.out.println("-----------------------------------");

        System.out.println(today.getYear());
        System.out.println(birthDay.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(birthDay.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println(("-------------------------------------------------------"));

        today = today.plusYears(1);

        System.out.println(today);

        System.out.println("------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("-----------------------------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        System.out.println(yourBirthDay);

        LocalDate yourBroBirthday = yourBirthDay.minusYears(2).minusMonths(3);
        System.out.println(yourBroBirthday);

        System.out.println("----------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);

        System.out.println("----------------------------------------------------");

        LocalDate graduation_date = LocalDate.of(2023, 1, 1);

        System.out.println(graduation_date.isBefore(LocalDate.of(2022, 12, 31)));

        System.out.println(graduation_date.isAfter(LocalDate.of(2022, 12, 31)));

        System.out.println("----------------------------------------------------");

        System.out.println(LocalDate.of(2022, 6, 16).isLeapYear());

    }
}
