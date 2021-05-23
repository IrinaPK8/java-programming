package day00_my_codes.For_Loop;

public class EvenDivisibleBy3And5 {
    public static void main(String[] args) {
        /** Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5 */

        for (int i = 1; i <= 100; i++){
            if ((i % 2== 0 && i % 3 == 0) || (i %2 == 0 && i % 5 == 0)){	// or can do another next if in existing if for (i % 3 ==0 && i % 5 == 0)
                System.out.print (i + " ");
            }
        }

    }
}
