package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed: ");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overLimit = currentSpeed - speedLimit;
        System.out.println("Your Speed is " + currentSpeed);
        System.out.println ("Speed limit is " + speedLimit);
        System.out.println("You are driving " + overLimit + " mph over the limit. Slow Down!");

    }
}
