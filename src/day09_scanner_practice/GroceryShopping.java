package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);  // all three variables depend on each other
        System.out.println("Enter price for milk: ");
        double milkPrice = scan.nextDouble();
        System.out.println("Enter price for bread: ");
        double breadPrice = scan.nextDouble();
        System.out.println("Enter Price for cucumbers: ");
        double cucumbersPrice = scan.nextDouble();
        double total = milkPrice + breadPrice + cucumbersPrice;
        System.out.println("Total price with 6% tax: $" + (total * 1.06));

    }
}
