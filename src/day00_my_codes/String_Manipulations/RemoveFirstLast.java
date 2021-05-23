package day00_my_codes.String_Manipulations;

public class RemoveFirstLast {
    public static void main(String[] args) {
        /** [Remove first and last]
         Given two words. Print the first word without its first character then print the second word without its last character.
         Input: apple banana
         Output: pple banan */

        String word1 = "apple";
        String word2 = "banana";

        System.out.println(word1.substring(1) + "\n" + word2.substring(0, (word2.length() - 1)));

    }
}
