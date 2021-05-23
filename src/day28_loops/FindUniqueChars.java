package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        /**
         * Find unique characters in String:
         * String word = "java";
         * 1) jac --> each character only one occurrence, remove duplicates
         * 2) jv --> only the characters that are unique/non-duplicate in the String
         * helloworld --> helowrd - remove duplicates
         * helloworld --> hewrd - take only unique letters
         */

        String word = "jaavva";
        String unique = "";            // declare one additional variable, make it empty. USING IT AS STORAGE!!!
        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(word.charAt(i) + "")) {  // + "" - makes it string   // if word.charAt(i) does not contain - is unique
                unique += word.charAt(i);                // if word does not contain character, add this character to unique variable
            }
        }
        System.out.println(unique);
    }
}
