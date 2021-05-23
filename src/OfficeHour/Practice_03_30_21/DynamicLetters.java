package OfficeHour.Practice_03_30_21;
import java.util.*;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendOrDescend = input.next();
        int starting;
        int ending;

        if(upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }

        if(ascendOrDescend.equals("ascending")) {
            for (int i = starting; i <= ending; i++) {
                System.out.print((char) i + " ");
            }
        }

    }
}
