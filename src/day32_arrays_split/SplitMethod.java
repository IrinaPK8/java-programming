package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        //indexes     1    2      3       4
    String words = "java:python:selenium:html";
        String [] wordsArray = words.split (":"); // convert to array which has its values
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);  // length of array

        for (String each : wordsArray){
            System.out.println(each);
        }
        System.out.println();

        String sentence = "today I am coding java class";
        String [] wordsInSentence = sentence.split(" ");             // store it into string array
        System.out.println("first word " + wordsInSentence[0]);           // print word from sentence
        System.out.println("first word " + sentence.split(" ")[0]);      // print word from sentence
        System.out.println("number of words in sentence " + wordsInSentence.length);          // length of sentence
        System.out.println();

        for (String each : wordsInSentence){
            System.out.println(each);
        }
    }
}
