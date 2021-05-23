package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));  // it will return/print larger number
        System.out.println(Integer.sum(50, 35));  // returns sum of two numbers
        System.out.println(Integer.min(5, 2));   // returns smaller number
        System.out.println(Integer.MIN_VALUE);   // smallest int can be in java
        System.out.println(Integer.MAX_VALUE);   // maximum int can be in java
        System.out.println(Double.max(234.4, 23.9));
        System.out.println(Double.min(123.4, 854.1));
        System.out.println("MAX Double " + Double.MIN_VALUE);
        System.out.println("MIN double " + Double.MAX_VALUE);
        System.out.println(Double.compare(5, 1));  // compare can return three values --> -1 if first larger than second
        System.out.println(Double.compare(5, 5));  // compare can return three values --> 0 if both are equal
        System.out.println(Double.compare(5, 45)); // compare can return three values --> -1 if first smaller than second
        System.out.println(Character.isDigit('8'));  // true because 8 is digit
        System.out.println(Character.isDigit('v'));  // false --> v is letter, not digit
        System.out.println(Character.isAlphabetic('Q'));  // true because Q is part of alphabet
        System.out.println(Character.isUpperCase('z'));   // false --> z is lower case
        System.out.println(Character.isLetter('9'));        // false --> 9 is not a letter

        char letter = 'A';
        System.out.println(Character.isUpperCase(letter));  // true
        if (Character.isUpperCase(letter)){
            System.out.println("Letter \"" + letter + "\" is uppercase");
        }

        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))) {
                // word.charAt(i) is a char. We autobox it to wrapper class Character AND use .isUpperCase method on it to check
                System.out.print(word.charAt(i));
            }
        }
        System.out.println();
        System.out.println(Character.MIN_VALUE);             //  ￿
        System.out.println(Character.MAX_VALUE);             //  ￿
        System.out.println(Boolean.TRUE);                    // always prints true
        System.out.println(Boolean.TRUE.equals (5 > 3));     // true
        System.out.println(Boolean.TRUE.equals (5 < 3));    // false
    }
}
