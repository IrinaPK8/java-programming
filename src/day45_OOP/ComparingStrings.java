package day45_OOP;

public class ComparingStrings {
    public static void main(String[] args) {

        String word1 = "java";                  // in string pool
        String word2 = "java";                  // it will reuse from string pool (above)
        String word3 = new String("java");      // created in HEAP outside string pool
        String word4 = new String("java");

        System.out.println(word1 == word2);     // true
        System.out.println(word1 == word3);     // false
        System.out.println(word3 == word4);     // false

        System.out.println(word1.equals(word2));     // true - comparing values
        System.out.println(word1.equals(word3));     // true - comparing values
        System.out.println(word3.equals(word4));     // true - comparing values


    }
}
