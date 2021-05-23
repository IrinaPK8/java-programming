package OfficeHour.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        /** Given an ArrayList of Strings and a target word (String)
         * print how many times the target word is in the ArrayList
         * Ex: Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
         * Target:javaOutput:2 */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        String targetWord = "java";

        int count = 0;

        for (String word : words){
            if (word.equals(targetWord)){
                count ++;
            }
        }
        System.out.println(targetWord + " --> " + count);

    }
}
