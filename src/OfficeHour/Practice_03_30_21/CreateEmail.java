package OfficeHour.Practice_03_30_21;

import java.util.*;

public class CreateEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();
        String email = "";

        if (wordOne.length() >= 6 && wordTwo.length() >= 6) {

            email = wordOne.substring(0, 4);
            email += wordTwo.substring(wordTwo.length() - 3);  // wordTwo.length() - 1 --> this a=is ALWAYS last index!!!
                                                                // IF WANT TO DO LAST THREE --> -3
            email += "@cybertek.com";
            System.out.println(email);

        } else {
            System.out.println("Invalid data");
        }

    }
}
