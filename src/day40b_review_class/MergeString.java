package day40b_review_class;
import java.util.*;
public class MergeString {
    public static void main(String[] args) {
        /** [Merge Strings]
         User is given two Strings, which could vary in length,
         merge these Strings so these Strings are
         combined into one String. Any extra characters from
         mismatched length String are at the end.
         Ex: String one = abc
         String two = defgh
         Output: adbecfgh */

        String s1 = "abc";
        String s2 = "defgh";
        String combined = "";
        int length = s1.length() > s2.length() ? s1.length() : s2.length();
                                                //Finds the longest length of the two, to ensure no chars go missing
        for(int i = 0 ; i < length ; i++) {
            if(i < s1.length()) {               // Make sure there is a char in s1 where we're looking.
                combined += s1.charAt(i);
            }
            if(i < s2.length()) { // Same with s2.
                combined += s2.charAt(i);
            }
        }
        System.out.println(combined);
        }
    }
