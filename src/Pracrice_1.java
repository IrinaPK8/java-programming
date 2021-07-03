import java.util.ArrayList;
import java.util.Arrays;

public class Pracrice_1 {
    public static void main(String[] args) {

        /*A Prime Number: Write a Java program to check if a given number
        is prime or not. Remember, a prime number is a number which is not
        divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
        Be prepared for cross, e.g. checking till the square root of a number, etc*/

        int num = 11;
        boolean prime = false;
        for (int i = 2; i <= num; i++) {
            if (i == num){
                prime = true;
            }
            if (num % i == 0) {
                break;
            }
        }
        System.out.println(prime);

        /* Print all permutations of String: Write a Java program to print all
        permutations of a given String. For example, if given String is "GOD"
        then your program should print all 6 permutations of this string,
        e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."*/

        String word = "DOG";
        String[] wordArr = word.split("");  // "d", "o", "g"

        for (int i = 0; i < wordArr.length; i++) {   // d
            String letter = wordArr[i];
            String letter2 = wordArr[i];
            for (int j = 0, k = wordArr.length - 1; j < wordArr.length; j++, k--) {
                if (wordArr[i] != wordArr[j]) {
                    letter += wordArr[j];
                }
                if (wordArr[i] != wordArr[k]) {
                    letter2 += wordArr[k];
                }
            }
            System.out.println(letter);
            System.out.println(letter2);
        }
    }

       /* String word = "dog";
        String[] wordArr = word.split("");  // "d", "o", "g"
        String letter = "";
        String temp1 = "";
        String temp2 = "";

        for (int i = 0; i < wordArr.length; i++) {   // d
            wordArr[0] = wordArr[i];
            System.out.println(wordArr);
            temp1 = String.join("", wordArr);


            String temp = wordArr[1];
            wordArr[1] = wordArr[2];
            wordArr[2] = temp;
            temp2 = String.join("", wordArr);

        }
        System.out.println(temp1);
        System.out.println(temp2);
    }*/



    }




