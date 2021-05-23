package day00_my_codes.Scanner;
import java.util.Scanner;
public class QuartersInDollar {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter quarters amount: ");
        int quarters = scan.nextInt();
        int dollar = quarters / 4;
        System.out.println("$" + dollar + " is " + quarters + " quarters");
    }
}
