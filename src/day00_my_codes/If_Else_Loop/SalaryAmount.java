package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class SalaryAmount {
    public static void main (String [] args){
    /* Write a program that will accept your salary amount.
    Then also ask the user if they are full time or not (boolean).
    If they are full time add 20000 to their salary, but if they are part time then subtract 5000.
    Print the final salary.
     */
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter salary amount: ");
        int salary = scan.nextInt();

        System.out.println ("Enter 1 - for full time or 2 - for part time: ");
        int fullPartTime = scan.nextInt();

        if (fullPartTime == 1){
        System.out.println ("Final salary is " + (salary + 20000));
        }else{
        System.out.println ("Final salary is " + (salary - 5000));
        }
            }
        }
