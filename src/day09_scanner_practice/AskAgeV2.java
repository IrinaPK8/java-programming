package day09_scanner_practice;

import java.util.Scanner; // package name java.util where Scanner class is located
                        // import means I'd like to use this class in my program, so import it

public class AskAgeV2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in); // Create new scanner and declare a variable of data type scanner so we can use it
                                    // Scanner is non-primitive. Scanner is class name
                                    // new is new topic of a class, real object in computer's memory. We need it to accept system input
                                    // System.in - means you are taking smth
        System.out.println ("How old are you?");
        int age = scan.nextInt ();   // here we re using scanner - we print same variable name "scan"
                                    // nextInt mean accept int value (whole number) from keyboard or console (if we want number to be printed)
                                    // by looking at int age = scan.nextInt (); we do not know the value. The program is waiting for us to type
        System.out.println (age + " - that's a great age!");
        // value is printed when program from keyboard is running!!!!! (and not stored inside program)
        // scan.close(); - close the scanner, optional, can be printed in code at the end for programs which are running constantly
    }
}
