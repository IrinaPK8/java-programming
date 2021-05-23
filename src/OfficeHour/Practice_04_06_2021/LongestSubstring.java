package OfficeHour.Practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
                                        /** biggest substring of matching characters
                                         Given a String find the biggest substring of chars that match and print it */
        String str = "aaabbbcccccddddeeeeeeeeeee";
        String longestSubstring = "";	/** making String that will hold the longest substring as we go
                                        through the loop and find longest substring - we will store it there until
                                        (going through loop) we won’t find the longer one, then we will substitute
                                            it and store in this String*/
        String temp = "";                /** we will go one character at a time & add it to temp one by one as loop runs*/


        for (int i = 0; i < str.length() - 1; i++) {
            temp += str.charAt(i);                                                     /** holds matching characters only */
            if (str.charAt(i) != str.charAt(i + 1) || i == str.length() - 2)	{	   /** comparing character with the next one, we want
                                                                                        to take an action when the next one is NOT matching */
                if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)){
                    temp += str.charAt(i+1);
                                                                                        /** reason we did i == str.length()-2 in the statement is so characters are only checked
                                                                                        In the 2nd to last index. In other iterations str.charAt(i) == str.charAt(i + 1)) part won’t be checked */
                }
                if (temp.length() > longestSubstring.length()) {	       /** if temp more than  longestSubstring, if yes → store in longestSubstring */
                    longestSubstring = temp;
                }
                temp = "";           /** setting temp back to empty because when we go to b, it needs to be empty for next iterations. Every time str.charAt(i) != str.charAt(i + 1) means there are two different letters in the string next to each other. So we need to check how long the same letters string is at that moment to see if it is the longest. After that temp should be nulled again to be able to check next sequence of same letters */
            }
        }
        System.out.println ("Longest substring: " + longestSubstring);


    }
}
