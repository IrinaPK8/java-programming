package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum =  new Random();                   // generating random numbers.
        Scanner scan = new Scanner (System.in);
        int secretNumber = randomNum.nextInt(101);          // creating random number between 0 and 100 ( last 1 means to stop before it)
        int guessingNumber;
        do {
            System.out.println("Guess the number: ");       // prompting scanner to type number
            guessingNumber = scan.nextInt();                // scanning
            if (guessingNumber>secretNumber){               // if statement - to tell if number less or more to help us to with range
                System.out.println("Number is too large");
            }else if (guessingNumber < secretNumber) {
                System.out.println("Number is too small");
            }
        }while(secretNumber != guessingNumber);             // comparing if secretNum does not equal guessingNumber --> if it is true - return to "do" and guess again
                                                            // if it is false (meaning secret equals guessing) --> Congrats! You won
        System.out.println("Congrats! You won. The secret number is " + secretNumber);

    }
}
