package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter hourly rate: ");

                   /* IF DONE REGULAR WAY: but we will need to change the code to change hourly rate
                    double hourlyRate = 50.0;
                    double weeklyPay = hourlyRate * 40;
                    double monthlyPay = weeklyPay * 52 / 12;      // weeklyPay multiply by amount of weeks in year divide by 12 months
                    double annualPay = weeklyPay * 12;
                    System.out.println (annualPay);
                    */

        double hourlyRate = scan.nextDouble();  // because we will be entering/changing hourly rate only, this variable only goes to scanner
        double weeklyPay = hourlyRate * 40;        // to print this value we do not use scanner, value will change according to printed hourly rate
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;
        double afterTax = annualPay * .8;
        System.out.println("Weekly pay is : " + weeklyPay);
        System.out.println("Monthly rate is: " + monthlyPay);
        System.out.println("Annual pay is : " + annualPay);
        System.out.println("Annual pay after 20% tax is: " + afterTax);



    }


}
