package day00_my_codes.String_Manipulations;

import java.util.*;

public class MiddleLetters1 {
    public static void main(String[] args) {
        /** You have a word, do the following:
         When word has odd number of characters and:
         3 or more characters, print middle letter
         Single character, print that character 3 times
         2. When word has even number of characters and:
         4 or more characters, print the middle 2 characters
         2 characters, print those 2 characters twice */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int charCNT = word.length();
        int middleIndex = charCNT / 2;

        if (charCNT == 1) {          // if word is one character
            System.out.println(word + word + word);
        } else if (charCNT == 2) {    // if word is two characters

            System.out.println(word + word);
        } else if (charCNT >= 3) {    // if word is 3 or more characters
            if (charCNT % 2 == 1) {                // ODD
                System.out.println(word.charAt(word.length() / 2));
            } else {                               // EVEN
                System.out.println(word.substring(middleIndex - 1, middleIndex + 1));
            }
        }

    }
}
