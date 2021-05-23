package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        /** if two side by side characters match, signal beep, print match letter
         * aa--> beep -->
         * vv --> beep --> v..... */

        String word = "jaavva";

        for (int index = 0; index < word.length() -1; index++) {    // need -1 not to go over the bound
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index + 1));

            if (word.charAt(index) == word.charAt(index + 1)) {
                                        // line above comparing letter 0 with letter 1 , next loop it will compare letter to letter
                System.out.println("beep - " + word.charAt(index));
            }
        }
    }
}
