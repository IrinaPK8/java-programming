package day00_my_codes.Arrays;

import java.util.*;

public class AverageTemperature {
    public static void main(String[] args) {
        /** Given an array temps with temperature values find and print the average value
         Example:
         input: 80 88 88 84 82 78 60 68
         output: 78.5
         */

        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        double total = 0.0;
        double average = 0.0;

        for (double n : temps) {
            total += n;
            average = total / temps.length;
        }
        System.out.println(average);
    }
}
