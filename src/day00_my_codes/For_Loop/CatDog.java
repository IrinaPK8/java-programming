package day00_my_codes.For_Loop;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        /** Print true if the string "cat" and "dog" appear the same number of times in the given string word.
         Example:
         input: catdog
         output: true
         input: catdog
         output: true
         input: catcat
         output: false
         input: cat-cheetah-dog-cat
         output: false
         */

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        String cat = "cat";
        String dog = "dog";

        for (int i = 0; i <= word.length() - 3; i++) {    // we do -3 because length of word starts with 1, not with 0!
            if (word.substring(i, i + 3).equals("cat")) {
                countOfCats++;
            }
        }
        for (int i = 0; i <= word.length() - 3; i++) {
            if (word.substring(i, i + 3).equals("dog")) {
                countOfDogs++;
            }
        }
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}