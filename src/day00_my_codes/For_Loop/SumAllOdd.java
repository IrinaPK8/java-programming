package day00_my_codes.For_Loop;

public class SumAllOdd {
    public static void main(String[] args) {
        /** Write a program that can calculate the sum of all the odd numbers between 1 ~ 100 */

        int sum = 0;
        for (int i = 1; i <= 100; i++) {            // or can declare int sum = 0; → sum ++ i → ... ln (sum);
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.print(sum);

    }
}
