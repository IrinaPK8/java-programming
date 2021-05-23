package day24_loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {

        int numberToStop;
        int count = 1;                     // this will be number to start count from
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to count until: ");
        numberToStop = scan.nextInt();      // this will be number to stop, to count until

        while (count <= numberToStop) {
            System.out.print(count + ", ");
        count++;
        }
    }
}
