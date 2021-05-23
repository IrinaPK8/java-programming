package day00_my_codes.If_Else_Loop;

public class CharacterChecker {
    public static void main(String[] args) {
        /** [Character Checker]
         Given a letter (char) determine if the character is an uppercase
         letter or lowercase letter
         Ex: 'b' --> lowercase
         'G' --> uppercase
         'O' --> uppercase
         Hint: Use the ASCII table */

        char letter = 'Z';
        if (letter >= 65 && letter <= 90) {
            System.out.println(letter + " uppercase");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " lowercase");
        }

    }
}
