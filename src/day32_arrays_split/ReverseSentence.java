package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "java is fun";
        /** java is fun --> fun is java
         */

        String [] words = sentence.split (" ");

        String reversed = "";

        /** print words array im reverse */

        for (int i = words.length - 1; i >=0; i--){
            // System.out.println(words[i] + " ");  OR see below
            reversed += words[i] + " ";                // string it into variable reversed
            System.out.println(reversed.trim());        // /trim is needed to remove space at the end
        }
    }
}
