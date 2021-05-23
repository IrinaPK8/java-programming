package OfficeHour.Practice_04_19_2021;

import day38_methods.StringUtils;       // importing another specific class in order to use its method
                                        // to import all classes, use * instead of package name

public class ReverseEachWord {
    public static void main(String[] args) {
        /** Given a String,reverse each individual word
         * and print the result
         * Hint: Use a nested loop, split
         * Input:It started to snow in Chicago
         * Output: tI detrats ot wons ni ogacihC
         * */
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }
    public static String reverseEachWord (String str){

        String reverse = "";

        for (String each : str.split(" ")){     // we used split because we want to separate each word
            // we reverse our string, each string with a for loop going from last to first letters

            reverse += StringUtils.reverse(each) + " "; // using custom method from another package
        }
        return reverse.trim();
    }
}
