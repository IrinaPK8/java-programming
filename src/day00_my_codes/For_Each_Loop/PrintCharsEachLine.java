package day00_my_codes.For_Each_Loop;
import java.util.Scanner;
public class PrintCharsEachLine {
    public static void main(String[] args) {
        /** Given a String, use a loop to print every character from the String on a new line.
         Example:     Input: hello
         h
         e
         l
         l
         O */
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        for (int i = 0; i < word.length(); i++)        // has to be either -1 or < (not <=)
            System.out.println(word.substring(i, i+ 1));
    }
}
