package OfficeHour.Practice_05_03_2021;
import java.util.*;
public class HidePassword {
    public static void main(String[] args) {
        /** Given an array of passwords (String). Hide each password
         * as a star (*) and show the hidden password
         * Ex:Input:{"one", "hi", "hold}
         * Output: [ ***, **, **** ] */

        String [] password = {"one", "apple", "hold"};
        ArrayList <String> hiddenPassword = new ArrayList <> ();

        for (String each : password) {
            // HELPER METHOD - method that does some action, it's called SOMEWHERE ELSE
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println(hiddenPassword);
    }
    public static String convertToStars(String str){
        String stars = "";
        for (int i = 0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }
}
