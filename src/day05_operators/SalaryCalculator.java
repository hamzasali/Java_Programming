package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 43, weeklyHours = 48;
        double stateTaxRate = 7, federalTaxRate = 12.9;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross Pay is: $" + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("State Tax is: $" + stateTax);
        System.out.println("Total Tax is: $" + totalTax);
        System.out.println("Net Income is: $" + salaryAfterTax);
        System.out.println("--------------------------------------");


        System.out.println("Gross Pay is: $" + salaryBeforeTax +
                "\n" +"Federal Tax is: $" + federalTax +
                "\n" +"State Tax is: $" + stateTax +
                "\n" + "Total Tax is: $" + totalTax +
                "\n" + "Net Income is: $" + salaryAfterTax );
    }
}
