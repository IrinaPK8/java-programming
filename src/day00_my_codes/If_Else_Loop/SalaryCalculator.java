package day00_my_codes.If_Else_Loop;

public class SalaryCalculator {
    public static void main(String[] args) {
        /** [Salary Calculator]
         Given the following information: hourly rate, weekly hours, and number of weeks.
         Check if all the inputs are valid and then calculate the salary.
         -  hourly rate cannot be negative or zero
         -> If invalid print: Hourly Rate cannot be Negative or Zero
         -  weekly hours cannot be zero, negative or more than 65
         -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
         -  number of weeks cannot be less than 1 and more than 52
         -> If invalid print: Number of weeks cannot be less than 1 or greater than 52
         Equation: salary = hourly rate * weekly hours * number of weeks */

        double hourlyRate = 50.0;
        int weeklyHours = 40;
        int numOfWeeks = 52;

        if (hourlyRate <= 0) {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        } else if (weeklyHours < 1 || weeklyHours > 65) {
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        } else if (numOfWeeks < 1 || numOfWeeks > 52) {
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        } else {
            System.out.println("Your salary is $" + hourlyRate * weeklyHours * numOfWeeks);
        }

    }
}
