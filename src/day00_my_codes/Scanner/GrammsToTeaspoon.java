package day00_my_codes.Scanner;
import java.util.Scanner;
public class GrammsToTeaspoon {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter grams: ");
        int grams = scan.nextInt();
        int teaspoons = grams / 15;
        System.out.println(grams + " grams equal " + teaspoons + " teaspoons");
    }
}
