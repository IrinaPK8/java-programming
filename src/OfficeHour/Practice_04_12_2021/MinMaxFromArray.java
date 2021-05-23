package OfficeHour.Practice_04_12_2021;

import java.util.Arrays;

public class MinMaxFromArray {
    public static void main(String[] args) {
        /**  •Write a program that can find the maximum number
         * from any given int array•Write a program that can
         * find the minimum number from any given int array
         *
         * ******** if i need to do this for testing, i will sort it and read first and last elements******** */

        int[] arr = {3, 1, -35, 5, 58, -18, 10, 4, 27};
        int min = arr[0];           // variable to store result while looping
        int max = arr[0];           // variable to store result while looping

        for (int each : arr) {      // each -> every element | for loop: arr [i]
            if (each < min) {
                min = each;
            }

            if (each > max) {
                max = each;
            }
        }
        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);

        /** FOR LOOP
         * int[] arr = {3, 1, -35, 5, 58, -18, 10, 4, 27};
         int min = arr[0];
         int max = arr[0];

         for (int i = 0; i< arr.length; i++) {
         if (arr [i] < min) {
         min = each;
         }

         if (arr [i] > max) {
         max = each;
         }
         }
         System.out.println("Min number is " + min);
         System.out.println("Max number is " + max);  */
    }
}
