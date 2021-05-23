package OfficeHour.Practice_05_03_2021;
import java.util.*;
public class CountLetters {
    public static void main(String[] args) {
        /** Given an ArrayList of Strings and a letter (char) print
         * how many times the letter is found in the ArrayList elements
         * Ex:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”
         * letter: ‘a’
         * Output:6 */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        char targetLetter = 'a';

        int count = 0;

        for (String word : words){
           for (int i = 0; i < word.length(); i++) {
               if (word.charAt(i) == targetLetter){
                   count ++;
               }
           }
            }
        System.out.println(targetLetter + " --> " + count);
        }
    }
