package day12_conditional_statement;

public class ComparisonExamples {
    public static void main (String [] args){
        int currentSpeed = 45;
        int speedLimit = 55;

        System.out.println(currentSpeed > speedLimit); // false 45 more than 55
        System.out.println(speedLimit < currentSpeed);    // false    55 not less 45
        System.out.println(speedLimit == currentSpeed); // false 55 not equal 45

        boolean isSpeeding = currentSpeed > speedLimit; // comparing two numbers is current speed is more than speed limit
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("current speed = " + currentSpeed + " mph");
        System.out.println("speed limit = " + speedLimit + " mph");

        currentSpeed += 20;  // 45 + 20 = 65 the result
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);

        System.out.println("=============================");
        System.out.println();

        double acctBalance = 250.25;
        double itemPrice = 100.00;
        // check if you can afford this item

                 //CAN PRINT LIKE THIS TOO - System.out.println("Can I afford it? " + canAfford); // true

        boolean canAfford = acctBalance >= itemPrice;
        System.out.println ("Can I afford? " + (acctBalance >= itemPrice));

        acctBalance -= 100.00;  // 250.25 - 100.00 - decreasing balance using short hand operator

        acctBalance -= itemPrice; // decreasing balance with shorthand operator
                    // OR acctBalance = acctBalance + itemPrice;

        boolean isBroke = acctBalance <= 0;
        System.out.println("Am I broke? " + isBroke);

            }
}
