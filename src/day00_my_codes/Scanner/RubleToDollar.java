package day00_my_codes.Scanner;
import java.util.Scanner;
public class RubleToDollar {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println ("DOLLAR TO RUB CONVERTER *** Enter dollar amount: ");
        double dollar1 = scan.nextDouble();
        double rub1 = dollar1 * 74.35;
        System.out.println("$" + dollar1 + " is " + rub1 + " rub");
        System.out.println("*** *** *** *** *** *** *** *** *** ***");
        System.out.println("RUB TO DOLLAR CONVERTER *** Enter rub amount: ");
        double rub2 = scan.nextDouble();
        double dollar2 = rub2 / 74.35;
        System.out.println(rub2 + " rub is " + dollar2);


    }
}
