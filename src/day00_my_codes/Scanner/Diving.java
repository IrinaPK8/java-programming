package day00_my_codes.Scanner;
import java.util.*;
public class Diving {
    /** In the sport of diving, seven judges award a score between 0 and 10,
     * where each score may be a floating-point value.
     The highest and lowest scores are thrown out, and the remaining scores are
     added together. The sum is then multiplied by the degree of difficulty for that
     dive. The degree of difficulty ranges from 1.2 to 3.8 points.
     The total is then multiplied by 0.6 to determine the divers score.
     Flow:
     Accept the 7 scores from the judges
     Accept the difficulty number
     Display the final score
     */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float[] score = new float[7];

            System.out.println("Enter score for judge 1:");
            score [0] = input.nextFloat();
            System.out.println("Enter score for judge 2:");
            score [1] = input.nextFloat();
            System.out.println("Enter score for judge 3:");
            score [2] = input.nextFloat();
            System.out.println("Enter score for judge 4:");
            score [3] = input.nextFloat();
            System.out.println("Enter score for judge 5:");
            score [4] = input.nextFloat();
            System.out.println("Enter score for judge 6:");
            score [5] = input.nextFloat();
            System.out.println("Enter score for judge 7:");
            score [6] = input.nextFloat();
            System.out.println("Enter difficulty:");
            float difficulty = input.nextFloat();

            float max = 0;
            float min = 0;

            Arrays.sort(score);

            float totalScore = ((score[1] + score[2] + score[3] + score[4] + score[5]) * difficulty * 0.6f);

            System.out.println("Total: " + totalScore);
    }
}
