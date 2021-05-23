package day00_my_codes.Nested_Loop;

import java.util.*;

public class OddEvenWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0) {
            // positive
            System.out.println("Enter a single word");
            String word = input.next();

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }
        } else {
            // negative
            System.out.println("Enter a character");
            char letter = input.next().charAt(0);
            System.out.println(letter);
        }
    }
}
