package OfficeHour.Practice_03_08_2021;
import java.util.Scanner;
public class Rectangle {                            // PIC: package --> import --> class
    public static void main (String [] args){

        //calculate perimeter 2 (w + l) and area (w * l)

        /* HARDCODING
        double length = 5;
        double width = 3;
        double perimeter = 2 * (length+width);
        double area = length * width;
        System.out.println("perimeter is " + perimeter);
        System.out.println("area is " + area);*/


        //DYNAMIC CODING
        Scanner input = new Scanner (System.in);     // Scanner object

        System.out.println("Enter length:");
        double length = input.nextDouble();

        System.out.println("Enter width:");
        double width = input.nextDouble ();

        double perimeter = 2 * (length+width);
        double area = length * width;

        System.out.println("perimeter is " + perimeter);
        System.out.println("area is " + area);


    }
}
