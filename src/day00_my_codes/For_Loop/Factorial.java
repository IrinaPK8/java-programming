package day00_my_codes.For_Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.
         * Calculate factorial and output result to the console.
         Example: input: 5   output: 120    5 * 4 * 3 * 2 * 1 */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    // the number that will be input through scanner
        long result = 1L;            // in result we will store number after each multiplication
        for (int i = 1; i <= n; i++) {
/** begin to count from1 , count one by one (i++) and multiply by result until i does not reach number n:
 eg,
 n = 5, i = 1 (starting point to count)
 result = 1 * 1 = 1
 Loop is still working because i did not reach 5 yet. Going back to loop beginning. Adding another 1 to i. Now i = 2.
 result = 1 (result from previous loop) * 2 (now i equals 2) = 2
 Loop is still working because i did not reach 5 yet. Going back to loop beginning. Adding another 1 to i. Now i = 3.
 result = 2 (result from previous loop) * 3 (now i equals 3) = 6
 Loop is still working because i did not reach 5 yet. Going back to loop beginning. Adding another 1 to i. Now i = 4.
 result = 6 (result from previous loop) * 4 (now i equals 4) = 24
 Loop is still working because i did not reach 5 yet. Going back to loop beginning. Adding another 1 to i. Now i = 5.
 result = 24 (result from previous loop) * 5 (now i equals 5) = 120
 Going back to beginning of loop = now i equals 5 (i <= n). Loop exits!!!
 */
            result = result * i;
        }
        System.out.println(result);
    }
}