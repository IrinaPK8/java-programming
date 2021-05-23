package day00_my_codes.Scanner;
import java.util.Scanner;
public class DimesInDollar {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of dimes: ");
        int dimes = scan.nextInt ();
        int dollar = dimes / 10;
        System.out.println("$" + dollar + " is " + dimes + " dimes");

    }
}
