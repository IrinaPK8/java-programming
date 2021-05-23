package day00_my_codes.Scanner;
import java.util.Scanner;
public class FeetToMetersConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("====== FEET TO METERS CONVERTER =====");
        System.out.println ("Enter feet: ");
        double feet = scan.nextDouble ();
        double meters = feet * 0.3048;
        System.out.println (feet + " feet is " + meters + " meters");

    }
}
