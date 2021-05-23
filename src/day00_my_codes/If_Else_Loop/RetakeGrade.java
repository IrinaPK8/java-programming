package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class RetakeGrade {
    public static void main (String [] args){
       /*Write a program that will give the grade after the retake.
       The program should read a score of the test and which attempt it was.
        If it's the first attempt -> subtract 10%
        If it's the second attempt -> subtract 20%
        If it's the third attempt -> subtract 35% */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter score: ");
        int score = scan.nextInt();
        System.out.println("Enter the number of the attempt (1, 2 or 3): ");
        int attempt = scan.nextInt();
        if (attempt == 1) {
            System.out.println ("Your score is: " + (score*0.9));
        }
        if (attempt == 2) {
            System.out.println ("Your score is: " + (score*0.8));
        }
        if (attempt == 3) {
            System.out.println ("Your score is: " + (score*0.7));
        }



    }
}
