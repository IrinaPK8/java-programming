package OfficeHour.Practice_03_30_21;
import java.util.*;
public class MaxNumberFromFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* TRADITIONAL WAY AS WE DID BEFORE
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();

        int max = 0;
        if (numOne > max){
            max = numOne;
        }
        if (numTwo > max){
            max = numTwo;
        } */

        int max = 0;
        int min = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println(max);


    }
}
