package day09_scanner_practice;

    import java.util.Scanner;

public class TempConvereter {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("------ FAHRENHEIT TO CELSIUS -------");
        System.out.println("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble (); //instead of double fahrenheit = 55.0; // input - because there is Scan name inout
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println (fahrenheit + "F is " + celsius + " in C");

        //IF WE CAST, WE CAN LOOSE DECIMALS IN THE PRINTED RESULT!!!

    }
}
