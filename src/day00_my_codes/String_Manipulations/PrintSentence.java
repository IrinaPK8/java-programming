package day00_my_codes.String_Manipulations;

public class PrintSentence {
    public static void main(String[] args) {
        String word = "     Winter is coming     ";
        word = word.trim();         // Winter is coming --> left after trim (no spaces before or after)
        System.out.println(word.length());     // .length() --> count letters and spaces starting from 1...

    }
}
