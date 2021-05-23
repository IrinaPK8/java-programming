package day09_scanner_practice;
import java.util.Scanner;                         // import scanner class
public class AddNumbers {
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);      // create scanner object
        System.out.println ("Enter two numbers: ");   // ask question/prompt
                       /* int num1 = 5;                      // assign value
                          int num2 = 4;                       // assign value
                        !!!  INSTEAD OF CHANGING NUM1 AND NUM2 TO CHANGE RESULT WE CAN USE SCANNER OBJECT  !!!
                        */
        int num1 = scan.nextInt();  // now we can use any number here
        int num2 = scan.nextInt();  // now we can use any number here
        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " equals " + result);
    }
}
