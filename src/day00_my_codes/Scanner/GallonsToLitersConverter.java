package day00_my_codes.Scanner;
import java.util.Scanner;
public class GallonsToLitersConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("====== GALLONS TO LITERS CONVERTER =====");
        System.out.println ("Enter gallons: ");
        double gallons = scan.nextDouble();
        double liters = gallons * 3.78541;
        System.out.println(gallons + " gallons equal " + liters + " liters");

    }
}
