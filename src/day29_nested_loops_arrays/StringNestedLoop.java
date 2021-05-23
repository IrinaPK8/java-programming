package day29_nested_loops_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {

        String word = "java";

        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j <= i ; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        System.out.println("===========================");

        for (int i = 0; i <= word.length(); i++){
                // i changes and tells us what letter to start typing from - 1, 2, 3 or 4 (j. a. .v or a)
            for (int j = i; j < word.length(); j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
