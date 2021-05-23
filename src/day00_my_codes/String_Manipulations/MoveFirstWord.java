package day00_my_codes.String_Manipulations;

public class MoveFirstWord {
    public static void main(String[] args) {
        /** [Move first word]
         Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:
         input: Java is a fun language
         output: is a fun language Java
         Hint: Use indexOf and substring */

/* option to declare variable → int space = str.trim().indexOf(“ “)  ; // finding position of first space
String firstWord = substring.str (0, space); */

        String sentence = "Java is a fun language";
        String firstWord = sentence.substring (0, sentence.indexOf(" "));
        String restOfSentence = sentence.substring (sentence.indexOf(" ") +1);
        System.out.println(restOfSentence + " " + firstWord);

    }
}
