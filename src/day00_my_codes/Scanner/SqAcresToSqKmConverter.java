package day00_my_codes.Scanner;
import java.util.Scanner;
public class SqAcresToSqKmConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("====== SQ ACRES TO SQ KM CONVERTER =====");
        System.out.println("Enter sq acres: ");
        double sqAcres = scan.nextDouble();
        double sqKm = sqAcres * 247.10538;
        System.out.println (sqAcres + " sq acres equal " + sqKm + " sq kilometers");

    }
}
