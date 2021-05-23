package day00_my_codes.Scanner;
import java.util.Scanner;
public class ClothesShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println (">>>>>>>>>>> SHOPPING LIST <<<<<<<<<<<");

        System.out.println ("Enter item #1: ");
        String itemName1 = scan.next ();
        System.out.println ("Enter price: ");
        int price1 = scan.nextInt();

        System.out.println ("Enter item #2: ");
        String itemName2 = scan.next ();
        System.out.println ("Enter price: ");
        int price2 = scan.nextInt();

        System.out.println ("Enter item #3: ");
        String itemName3 = scan.next ();
        System.out.println ("Enter price: ");
        int price3 = scan.nextInt();

        System.out.println("You have purchased " + itemName1 + ", " + itemName2 + ", and " + itemName3);
        System.out.println("You total price including 6% tax is $" + ((price1 + price2 + price3) * 1.06));

    }
}
