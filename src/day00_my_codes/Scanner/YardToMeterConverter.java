package day00_my_codes.Scanner;
import java.util.Scanner;
public class YardToMeterConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("====== YARD TO METER CONVERTER =====");
        System.out.println ("Enter yards: ");
        double yards = scan.nextDouble ();
        double meters = yards * 0.9144;
        System.out.println (yards + " yards is " + meters + " meters");

    }
}
