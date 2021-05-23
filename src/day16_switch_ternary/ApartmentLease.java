package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("* * * * * * * * WELCOME TO ADAIRE APARTMENTS * * * * * * * *");

        int numBedrooms = 2;            // 0, 1, 2
        int startingPrice;          // 1454, 1745, 2899

        switch(numBedrooms) {
            case 0:
                startingPrice = 1454;
                System.out.println("Studio apartment selected\nStarting price is $" + startingPrice);
                break;
            case 1:
                startingPrice = 1745;
                System.out.println("One bedroom apartment is selected\nStarting price is $" + startingPrice);
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("Three bedroom apartment selected\nStarting price is $" + startingPrice);
                break;
            default:
                System.out.println(numBedrooms + " currently unavailable");
        }
        // System.out.println("Starting price is $" + startingPrice); - CAN PRINT THIS ONE INSTEAD OF FOR EACH CASE
    }
}