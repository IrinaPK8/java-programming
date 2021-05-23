package day32_arrays_split;
import java.util.*;

public class MaxMinPrice {
    public static void main(String[] args) {
        // index    0          1        2         3        4            5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad",  "iphone 12 case" };
        double[] prices = { 99.99,    150.0,   9.99,      250.0 ,  439.50,     39.99};
        int[] itemIDs =   { 12345 ,   12346,   12347,     12348,   12349,      12350};

        /** FIND THE MOST EXPENSIVE ITEM AND PRINT DETAILS
         * PSEUDOCODE:
         *     Declare:
         *         double maxPrice = price of first item
         *         int indexOfMaxPrice = index of first item - 0
         *
         *     LOOP STARTS FOR prices Array:
         *         read price[i] from array
         *             if price[i] is more than maxPrice
         *                 change maxPrice to price[i]
         *                 set indexOfMaxPrice to i
         *
         *     END FOR LOOP
         *     PRINT items[indexOfMaxPrice] + prices[indexOfMaxPrice] + itemIDs[indexOfMaxPrice]*/

            // print array values as string i nsame line, without loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        System.out.println();

        System.out.println("--- 1) FIND AND PRINT DETAILS OF MOST EXPENSIVE ITEM ---");

        double maxPrice = prices[0];        // assume first price is max price
        int indexOfMaxPRice = 0;            // assume max price is at index 0

        for (int i = 0; i < prices.length; i++){
            if (prices [i] > maxPrice){
                maxPrice = prices[i];
                indexOfMaxPRice = i;
            }
        }
        System.out.println("Max price is " + maxPrice);
        System.out.println("Index is " + indexOfMaxPRice);          // will give the index number which we can use for price and item name
        System.out.println(items[indexOfMaxPRice] + " - $" + prices[indexOfMaxPRice] +" - #" +itemIDs[indexOfMaxPRice]);
        System.out.println();

        /** FIND THE LEAST EXPENSIVE ITEM AND PRINT DETAILS */

        System.out.println("--- 2) FIND AND PRINT DETAILS OF LEAST EXPENSIVE ITEM ---");

        double minPrice = prices[0];
        int indexOfMinPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println("Min price is " + minPrice);
        System.out.println("Index is " + indexOfMinPrice);          // will give the index number which we can use for price and item name
        System.out.println(items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] +" - #" +itemIDs[indexOfMinPrice]);
    }
}
