package day00_my_codes.String_Manipulations;

public class ReplaceChars {
    public static void main(String[] args) {
        /** Given a String message with some text and a number (1-3) replace certain characters from the String message.
         When the number is:
         1: replace 'a' with 'e'
         2: replace 's' with 'r'
         3: replace 'o' with 'z'
         Ex:
         message: java class is fun
         number: 1
         Output: jeve cless is fun
         Ex:
         message: java class is fun
         number: 2
         Output: java clarr ir fun */

        int number = 3;
        String sentence = "java class is fun";
        switch (number) {
            case 1:
                System.out.println(sentence.replace("a", "e"));
                break;
            case 2:
                System.out.println(sentence.replace("s", "r"));
                break;
            case 3:
                System.out.println(sentence.replace("o", "z"));
                break;
        }

    }
}
