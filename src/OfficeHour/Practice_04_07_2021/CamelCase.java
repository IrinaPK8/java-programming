package OfficeHour.Practice_04_07_2021;

public class CamelCase {
    public static void main(String[] args) {
        /** Camel Case
         Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
         Every word, except the first word, begins with an uppercase letter.
         The other characters of the word will be lowercase
         Ex: Input: thisHasManyWordsToFind
         Output: 6       */

        String str = "thisHasManyWordsToFind";
        int words = 1;              // variable to hold how many words we have
        String temp = "";

        for (int i =0; i < str.length(); i++){

            temp += str.charAt(i);      // this will print character by character

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {      // checking through alphabet
                words++;                    // if condition is met, counter will add one
            }
        }
        System.out.println("Words: " + words); // result is 6 (not 5) because

    }
}
