package day08_casting_scanner;

public class ShoppingBalanceCalculator {

    public static void main (String [] args){

        double initialBalance = 345.00;
        double price1 = 20.88;
        double price2 = 89.90;
        double price3 = 15.00;
        double remainBalance = initialBalance - price1 - price2 - price3; // OR initialBalance - (price1 + price2 + price3)

        System.out.println ("The initial balance is $" + initialBalance);
        System.out.println ("The purchase total is $" + (price1 + price2 + price3));
        System.out.println ("The remaining balance after the purchase is $" + remainBalance);

        int balanceNoCents = (int)remainBalance; //CASTING decimal to whole numbers
        System.out.println("The balance without cents is $" + balanceNoCents);


    }
}
