package OfficeHour.Practice_04_06_2021;
import java.util.Random;

public class RandomSixDigitNumber {
    public static void main(String[] args) {
                            /** Generate a random number that is six digits long.
                             * Each digit in this number should be unique, i.e. have
                             * six different characters that make it up. Print the number */

        Random random = new Random();
        String randomNumber = "";
        while (randomNumber.length() != 6); {  // using while loop because we do not know how many time it will run to get  unique numbers
                            /**randomNumber.length() != 6 → means the loop will run until it doesn't
                             * equal to 6/ until we get 6 digits/characters in a number.
                             * WHEN IT EQUALS SIX  - LOPP WILL STOP/EXIT*/
            int eachRandom = random.nextInt(10);
                            /** to modify range of numbers to be from 1 to 10 (not
                             * from 0) →  … = random.nextInt(9) + 1 → if 0 is random,
                             * it becomes 1 because we put +1, if 9 is random, it becomes 10, because we put + 1 */
            if (!randomNumber.contains("" + eachRandom)){   //“” + eachRandom - VERY IMPORTANT!!! WE CANNOT USE .CONTAINS WITH EACHRANDOM BECAUSE EACHRANDOM IS NOT A STRING. TO MAKE IT STRING, WE ADD EMPTY STRING “” + !!!!!!!!!
                randomNumber += eachRandom;			        //	if it does not contain such number yet, add it to it
            }
        }
        System.out.println("Random number: " + randomNumber);
    }
}
