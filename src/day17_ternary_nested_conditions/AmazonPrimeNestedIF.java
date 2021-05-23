package day17_ternary_nested_conditions;

public class AmazonPrimeNestedIF {
    public static void main(String[] args) {

        // PSEUDOCODE - code written in words
        // when isPrimeMember = true, print "Eligible for free 2 day shipping"
        // when itemPrice is > 25 --> "Eligible for free regular shipping"
        // otherwise print "Not eligible for free shipping. Shipping fee is $10"

        double price = 195;
        boolean isPrimeMember = true;

        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (price >= 25.0) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee is $10");
            }
        }
    }
}
