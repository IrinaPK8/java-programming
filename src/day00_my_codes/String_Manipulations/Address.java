package day00_my_codes.String_Manipulations;

public class Address {
    public static void main(String[] args) {
        /** A person will enter their address into a String. Make sure the String is not empty.
         If it is empty print: "No address found".
         If there is an address make all the text uppercase to match the expected format
         Ex:
         Input: 231332 leaf ave, lake city 3132
         Output: 231332 LEAF AVE, LAKE CITY 3132
         Ex:
         Input: ""
         Output: No address found */

        String address = "leaf ave, lake city 3132";
        if (address.equals ("")){
            System.out.println("No address found");
        }else {
            System.out.println(address.toUpperCase());
        }
    }
}
