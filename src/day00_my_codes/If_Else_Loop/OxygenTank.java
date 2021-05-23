package day00_my_codes.If_Else_Loop;
import java.sql.SQLOutput;
import java.util.Scanner;
public class OxygenTank {
    public static void main (String [] args){
        /* You are diving in the ocean. Your oxygen tank has a certain level (number)
        and you must print a message based on the level:
                > Above 90 - Your tank is full
                > Above 80 - Still okay
                > Above 70 - Don't go too far
                > Above 60 - Start to head back
                > Above 50 - Be careful now you at at 50% */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter oxygen level: ");
        int level = scan.nextInt();

        if (level >= 90){
            System.out.println ("Your tank is full");
        }else if (level >= 80){
            System.out.println ("Still ok");
        }else if (level >= 70){
            System.out.println ("Don't go too far");
        }else if (level >= 60){
            System.out.println ("Start to head back");
        }else if(level >= 50){
            System.out.println ("Be careful now you at at 50%");
        }else if (level <50) {
            System.out.println ("You are in danger! Go back!");
        }
    }
}
