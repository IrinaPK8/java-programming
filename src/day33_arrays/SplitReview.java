package day33_arrays;
import java.util.*;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String [] array = word.split("a");
        System.out.println(array.length);

            /** IF WORD ENDS WITH SPLIT CHARACTER: DEDUCT ONE FROM LENGTH --> ARRAY.LENGTH - 1;   */
        int countOfA = array.length - 1;
        System.out.println("count of a = " + countOfA);

        if (word.endsWith("a")) {
            countOfA ++;
        }
        System.out.println("count of a = " + countOfA);

        System.out.println();
        System.out.println("SPLIT BY EMPTY STRING");
        String [] strArray = word.split("");
        System.out.println(strArray[0]);   // etc [1], [2] .....

        String word2 = "java1html2sql";
        String [] strArr = word2.split("\\d") ;     // split by any number in string (all nums will be split)
        System.out.println(Arrays.toString(strArr));

        word2 = word2.replaceAll("\\d", "_");       // replace any number in string to _
        System.out.println(word2);
        System.out.println();

        /** checking password validity */
        System.out.println("=========VALID/INVALID PASSWORD=========");
                String password = "Abcd12_5";      // USING REGEX PASSWORD VALIDATION
        if (password .matches ("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }

    }
}
