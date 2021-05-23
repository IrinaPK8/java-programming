package day00_my_codes.For_Each_Loop;
import java.util.Scanner;
public class JavaAppearance {
    public static void main(String[] args) {
        /** Print the number of times that the string appears anywhere in the given String word
         input: javaxjava    output: 2
         input: javaxjava    output: 2
         Example:
         input: javaxjavaapplepearjavaegg
         output: 3 */

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;                  // here we will count how many times word java appears (like 1, 2, 3....)

        for (int i = 0; i <= word.length() - 4; i++){
                // i moves from beginning of word 4 letters at a time --> word.substring(i, i + 4)
            if (word.substring(i, i + 4).equals("java")){
                count++;                // counting when matches
            }
        }
        System.out.println(count);
    }
}
