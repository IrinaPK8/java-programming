package day24_loops;

import java.util.Scanner;  // SHORTCUT: MAC: Option+Enter. Windows: Alt+Enter

public class GiveMe5$ {
    public static void main(String[] args) {

        int dollars = 0;  // OR can do just  int dollars = scan.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars: ");  // askinf to give $5
        dollars = scan.nextInt();
        while (dollars != 5) {   /* if entered amount is not $5
                                --> keep on asking for $5 again */
            System.out.println("Give me 5 dollars");
            dollars = scan.nextInt();  /* we need this to be able to type
                                dollar amount again, OTHERWISE - infinite loop */
        }
        System.out.println("Thank you for $5");
    }
}