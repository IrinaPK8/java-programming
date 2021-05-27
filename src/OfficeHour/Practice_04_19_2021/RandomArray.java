package OfficeHour.Practice_04_19_2021;
import java.util.*;
public class RandomArray {
    public static void main(String[] args) {
        /** Challenge: Random Array
         * 1)Ask the user to enter how many numbers they want in their array
         * 2)Ask the user the max number they want for the random numbers
         *       –Use this as the bound for your random number
         * 3)Create an int array with random numbers. The number of elements is based on the given number
         * Flow:How many numbers do you want: 5
         * What is the max number value: 50
         * --> Print the array with 5 random numbers from 0 to 50 */
        int [] a = getRandomIntArray(5, 50);
        System.out.println(Arrays.toString(a));

    }
    public static int [] getRandomIntArray(int size, int maxRandomNumber){

        Random random = new Random();
        int [] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr [i] = random.nextInt(maxRandomNumber);
                        /** loop will run as many times as int size. Let's say 5.
                         * Loop will generate 5 random numbers and store them into array */

        }
        return arr;
    }
}