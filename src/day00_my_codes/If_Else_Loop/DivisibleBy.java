package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class DivisibleBy {
    public static void main (String [] args){
       /*  Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5
        Ex:  number = 65
        Output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true */

        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter number: ");
        int number = scan.nextInt ();

        boolean by2 = true;
        if(number%2 == 0){
            System.out.println (number + " is divisible by 2: ");
        }
        boolean by3 = true;
        if(number%3 == 0){
            System.out.println (number + " is divisible by 3");
        }
        if (number%5 == 0){
            System.out.println (number + " is divisible by 5");
        }
        }
}
