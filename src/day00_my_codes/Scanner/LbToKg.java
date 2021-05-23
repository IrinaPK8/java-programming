package day00_my_codes.Scanner;
import java.util.Scanner;
public class LbToKg {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter lb value: ");
        double lb = scan.nextDouble();
        double kg = lb / 2.205;
        System.out.println(lb + " is " + kg + " kg");
}
}