package OfficeHour.Practice_03_22_2021;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {

        // NEXT...  TRICK !!!!! //

        Scanner input = new Scanner (System.in);
        System.out.println ("Enter a number");
        int number = input.nextInt();           // when enter is hit - next line in code takes the input number
        System.out.println("Enter your name");
        input.nextLine();                       /* this line is needed before nextLine (or nextInt, nextDouble, nextBoolean etc.,
                                                 so scanner so Java can let you print next input */
        String name = input.nextLine();

        System.out.println(number);
        System.out.println(name);
    }
}
