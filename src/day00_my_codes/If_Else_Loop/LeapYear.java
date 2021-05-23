package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class LeapYear {
    public static void main (String [] args){
        /* Create a program that will accept a year. Check if the year is a leap year.
        If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year".
        Hint: Let's say if a number is evenly divisible by 4 it is a leap year*/

        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter year: ");
        int year = scan.nextInt();
        if(year % 4 == 0){
        System.out.println (year + " is a leap year");
        }else{
        System.out.println (year + " is not a leap year");
        }



            }
}
