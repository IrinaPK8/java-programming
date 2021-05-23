package day00_my_codes.Nested_Loop;
public class TeslaBuyer {
    public static void main(String[] args) {

        char model = 'S';                   // Y, S, X
        String trim = "Plaid";              // Long Range, Plaid, Plaid+, Performance, Standard Range Plus
        int rangeMi;                        // mi
        int topSpeed;                       // mph
        double zeroTo60Time;                // sec
        int price;                          // $

        if (model == 'S') {
            System.out.println("Model S is selected");

            if (trim.equals("Long Range")) {
                rangeMi = 412;
                topSpeed = 155;
                zeroTo60Time = 3.1;
                price = 74490;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else if (trim.equals("Plaid")) {
                rangeMi = 390;
                topSpeed = 200;
                zeroTo60Time = 1.99;
                price = 114490;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else if (trim.equals("Plaid+")) {
                rangeMi = 520;        // more than
                topSpeed = 200;
                zeroTo60Time = 1.99;    // less than
                price = 144490;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else {
                System.out.println("Invalid selection");
            }
        }
            else if (model == 'Y'){
            System.out.println("Model Y is selected");

            if (trim.equals("Long Range")) {
                rangeMi = 326;
                topSpeed = 135;
                zeroTo60Time = 4.8;
                price = 45690;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else if (trim.equals("Performance")) {
                rangeMi = 303;
                topSpeed = 155;
                zeroTo60Time = 3.5;
                price = 56690;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else {
                System.out.println("Invalid selection");
            }
        } else if (model == 'X') {
            System.out.println("Model X is selected");
            if (trim.equals("Long Range")) {
                rangeMi = 360;
                topSpeed = 155;
                zeroTo60Time = 3.8;
                price = 84690;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else if (trim.equals("Plaid")) {
                rangeMi = 340;
                topSpeed = 163;
                zeroTo60Time = 2.5;
                price = 114690;
                System.out.println("Trim selected - " + trim + "\nRange - " + rangeMi + "\nTop Speed - " + topSpeed + "\n0 to 60 mi - " + zeroTo60Time + "\nPrice - $" + price);
            } else {
                System.out.println("Invalid selection");
            }
        }
        }
    }
