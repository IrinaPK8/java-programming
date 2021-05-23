package OfficeHour.Practice_03_03_2021;

public class StageCalculator {

    public static void main (String [] args){

        double num1 = 5.0;
        double num2 = 10.0;
        double addition = num1 + num2;
        double substract = num1 - num2;
        double multiplic = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println ("Calculations for " + num1 + " & " + num2);
        System.out.println (num1 + " + " + num2 + " = " + addition);
        System.out.println (num1 + " - " + num2 + " = " + substract);
        System.out.println (num1 + " * " + num2 + " = " + multiplic);
        System.out.println (num1 + " / " + num2 + " = " + division);
        System.out.println (num1 + " % " + num2 + " = " + remainder);

        /*
        Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
         */

    }
}
