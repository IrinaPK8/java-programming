package day00_my_codes.Scanner;
import java.util.Scanner;
public class inchesToCmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("====== INCHES TO CM CONVERTER =====");
        System.out.println ("Enter inches: ");
        double inches = scan.nextDouble();
        double cm = inches * 2.54;
        System.out.println (inches + " inches is " + cm + " cm");

    }
}
