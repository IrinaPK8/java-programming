package day00_my_codes.Scanner;
import java.util.Scanner;
public class NickelsInDollar {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter amount of nickels: ");
        int nickels = scan.nextInt();
        int dollar = nickels / 20;
        System.out.println("$" + dollar + " is " + nickels + " nickels");
    }
}
