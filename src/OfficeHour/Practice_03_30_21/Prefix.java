package OfficeHour.Practice_03_30_21;

public class Prefix {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 1;                             // this number will determine which is a prefix: 1 - first letter, 2 - first and second letters etc.
        String prefix = str.substring(0, n);  /* lets have new string where we will store prefix --> print out prefix from 0 (first letter)
                                                to n - whatever number of letter there will be in prefix */
        String remaining = str.substring(n);    /* will print out the rest of the word after prefix starting from letter under number n */
        System.out.println(remaining.contains(prefix));     // checking if the remaining string contains prefix



    }
}
