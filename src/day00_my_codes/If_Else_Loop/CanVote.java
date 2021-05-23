package day00_my_codes.If_Else_Loop;
import java.util. Scanner;
public class CanVote {
    public static void main (String [] args){
        /*Write a java program that can identify if a person is eligible to
        vote for the president. Age of voting: 18. Print "Eligible to vote" or
        "not eligible to vote".  => To make it dynamic change the three
        angles to be Scanner inputs
         */
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter age: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println ("Eligible to vote");
        } else {
            System.out.println ("Not eligible to vote");
        }


    }
}
