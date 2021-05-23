package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        /**
         *loop from 0 until the last index of the word*/

       /* FOR SHORT WORDS THIS METHODS WORKS
        String word = "java";
        System.out.println(word.length());

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3)); */


        //FOR LONG WORDS E BETTER USE FOR LOOP

        String word = "python and java";
        for (int i = 0; i < word.length(); i++) {       // start from 0 until length is less that word length
            System.out.println(i + ": " + word.charAt(i));         // i will be changing in the loop, that's why we put here i --> dynamic code
        }
        // REVERSE ORDER
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(i + " - " + word.charAt(i));
        }
    }
}