package day00_my_codes.String_Manipulations;
import java.util.*;

public class ThreeMidLetters {
    public static void main (String [] args) {
        /**
         Given a String variable word print the middle three characters if the
         word is an odd number of characters and has more than 5 characters.
         If the word does not meet the requirements print invalid.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int count = word.length();

        if (count % 2 == 0 || count <= 5){
            System.out.println("invalid");

        }else if (count % 2 == 1 && count > 5) {
            int midPoint = count / 2;
            System.out.println(word.substring(midPoint - 1, midPoint +2));
        }
    }
}
