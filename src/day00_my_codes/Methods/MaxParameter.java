package day00_my_codes.Methods;
import java.util.Scanner;
public class MaxParameter {
    /** Finish the method max which has two parameters, x and max.
     * if x is bigger than max return x
     * if max is bigger than x return max
      *all other cases return x        */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));

    }
    public static int max(int x, int max){
                // this method takes input from main method, runs it here and returns result back to main method
        if (x > max) {
            return x;
        }else if (x < max) {
            return max;
        }else {
            return x;
        }
    }
}
