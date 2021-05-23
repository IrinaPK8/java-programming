package day00_my_codes.Scanner;
import java.util.Scanner;
public class ValidTriangle {
    public static void main (String [] args){
            /* A triangle is valid if the sum of all the three angles is equal
            to 180 degrees. Write a program that declares three integers as angles and
            check whether the triangle is valid or not. Print "Valid triangle" or "Not a valid triangle".
             => To make it dynamic change the three angles to be Scanner inputs
             */
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter angle 1: ");
        double angle1 = scan.nextDouble();
        System.out.println ("Enter angle 2: ");
        double angle2 = scan.nextDouble();
        System.out.println ("Enter angle 3: ");
        double angle3 = scan.nextDouble();
        double sum = angle1 + angle2 + angle3;

        if (sum == 180){
            System.out.println ("Valid triangle");
            }else{
            System.out.println ("Not valid triangle");
            }
                }
            }
