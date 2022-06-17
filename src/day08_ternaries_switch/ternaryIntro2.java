package day08_ternaries_switch;

public class ternaryIntro2 {
    public static void main(String[] args) {

        /*int num = 43;
        String result = "";

        if (num > 0) {
            result = "Positive";
        } else if (num < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println(result);
        System.out.println("--------------------");


        String result2 = num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero";
        System.out.println(result2);*/
        System.out.println("--------------------");

        int n = 3;

        String weekDay = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday" :
                (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday";

        System.out.println(weekDay);

        int num =7;

        String month = (num == 1) ? "January":(num == 2) ? "February":(num == 3) ? "March":(num == 4) ? "April":(num == 5) ?
                "May":(num == 6) ? "June":(num == 7) ? "July":(num == 8) ? "August":(num == 9) ? "September":(num == 10)
                ? "October":(num == 11) ? "November":"December";
        System.out.println(month);
    }
}

