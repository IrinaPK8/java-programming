package day00_my_codes.For_Loop;
import java.util.*;

public class UpperLowerAlphabet {
    public static void main(String[] args) {
        /** Write a program that will ask ‘upper’ or ‘lower’:
         •If itis upper: print the alphabet in all uppercase letter from A to Z
         •If it is lower: print the alphabet in all uppercase letter from a to z
         Challenge: Also ask if they want to show the alphabet in ascending or order descending:
         -Ascending: A –Z or a –z
         -Descending: Z –A or z –a */

        Scanner scan = new Scanner (System.in);

        String cases = "";
        String ascOrDesc = "";

        System.out.println("Do you want upper or lower case:");
        cases = scan.next();

        System.out.println("Do you want ascending or descending:");
        ascOrDesc = scan.next();


        if (cases.equals("lower") && ascOrDesc.equals("ascending")){
            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(i + " ");
            }
        }
        if (cases.equals("lower") && ascOrDesc.equals("descending")){
            for (char i = 'z'; i >= 'a'; i--) {
                System.out.print(i + " ");
            }
        }

        if (cases.equals("upper") && ascOrDesc.equals("ascending")){
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i + " ");
            }
        }
        if (cases.equals("upper") && ascOrDesc.equals("descending")){
            for (char i = 'Z'; i >= 'A'; i--) {
                System.out.print(i + " ");
            }
        }

    }
}
