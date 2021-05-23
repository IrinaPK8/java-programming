package day00_my_codes.Nested_Loop;
import java.util.Scanner;

public class AsteriskTriangle {
    public static void main(String[] args) {
        /** Write a program that will create a triangle of asterisks based on size n.
         Example: input: 5
         output:
         *
         **
         ***
         ****
         *****
         input: 3
         output:
         *
         **
         ***    */

                // int i = 1;       // amount or rows
                // int j = 1;       // amount of stars
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();

                for (int i = 1; i <= n; i++){

                    for (int j = 1; j <= i; j++){    // j<= i - the number in i will determine how many stars per row is to be printed
                        System.out.print("*");       // we use print instead of println!!! otherwise each star will go to next lane
                    }
                    System.out.println();
                }
            }
        }
