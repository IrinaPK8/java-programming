package OfficeHour.Practice_04_06_2021;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /** Palindrome - a word that is the same read forwards and backwards.  4/6/21
         User takes a word from the console.
         Print true if the word is a palindrome.
         Print false if the word is not palindrome.
         input: civic →  output: true
         input: java → output: false */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
                                              /** 2 - means check until the middle only, if letter from the first half match letters
                                                 from second half - it is already a palindrome → makes no sense to check the rest */
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {   // - i means to deduct from the end as much as from the beginning (where i now is)
                isPalindrome = false;
                break; // means no need to check further
            }
        }
        System.out.println(isPalindrome);
    }
}
