package day00_my_codes.String_Manipulations;

public class MidChar {
    public static void main(String[] args) {
        /** [MiddleChar]
         Given a String, write a program to display the middle character of a string
         a)	If the length of the string is even there will be two middle characters.
         b)    If the length of the string is odd there will be one middle character.
         Ex: Input: elephant Output: The middle characters: ph */

                    // ODD - apple → p has a middle index of 2 (01234). int length /2 = 2 → this will be middle character for all odd words
                    // EVEN - even → 0123. If we divide int length by 2, we will get 2 -> letter e, and we need to print out two middle letters - v and e.

        String word = "apple";
        if (word.length() % 2 == 1) {                // ODD
            System.out.println(word.charAt(word.length() / 2));            // charAt will print letter based on the index number of the middle letter
            /**OR
            System.out.println(word.substring(word.length() / 2), word.length() / 2 + 1);
             // start from word.length() / 2 letter, stop at (word.length() / 2) +1 (i e, before that +1 letter because that’s how substring works)*/
        }
        word = "even";
        int index = word.length() / 2;
        if (word.length() % 2 == 0) {            // EVEN
            System.out.println(word.charAt(index - 1) + "" + word.charAt(index));
                                                // index - 1  -> letter v, index 2 -> letter e
            /**ORORORORORORO
            System.out.println(word.substring(index - 1, index + 1));
             // +1 means to stop before character n but print letter e before that*/
        }

    }
}
