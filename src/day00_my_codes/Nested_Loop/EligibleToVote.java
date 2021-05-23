package day00_my_codes.Nested_Loop;
import java.util.*;
public class EligibleToVote {
    public static void main(String[] args) {
                    /* [EligibleToVote] Redo the EligibleToVote task but this time ask which country the person has citizenship for
                    If the citizenship is for the USA then ask the user to enter their age. Use the age to figure out if they vote.
                    -> 18+ : You are eligible to vote
                    -> < 18: You must be at least 18 years old to vote
                    If the person is not a US citizen: You must be US citizen in order to vote" */
        String citizenship = "UK";
        int age = 19;
         /**if (citizenship.equals ("USA")){
            if (age >= 18){
                System.out.println("You are eligible to vote");
            } else if (age < 18) {
                System.out.println("You must be at least 18 years old to vote");
            }
        }else {
            System.out.println("You must be US citizen in order to vote");
        } */

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the country of your citizenship?");
        citizenship = scan.next();
        if (citizenship.equals ("USA")){
            System.out.println("Enter your age");
            age = scan.nextInt();
            if (age >= 18){
                System.out.println("You are eligible to vote");
            } else if (age < 18) {
                System.out.println("You must be at least 18 years old to vote");
            }
        }else {
            System.out.println("You must be US citizen in order to vote");
        }
    }
}
