package OfficeHour.Practice_04_07_2021;

public class DuplicateCharacters {
    public static void main(String[] args) {
        /** [IQ] Duplicate characters
         Given a String, find and print the duplicate characters.
         A character is duplicate if it appears more than once in the String.
         Ex:AAABCCDEEF → Output:ACE */

        String str = "AAABCCDEEF";

        for (int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = 0; j <= str.length()-1; j++){
                if (str.charAt(i) == str.charAt(j)) {  // checks if A == A etc for each letter
                    count++;
                }
            }
            if (count > 1){
                System.out.println(str.charAt(i) + " is duplicate");
            }
        }
    }
}