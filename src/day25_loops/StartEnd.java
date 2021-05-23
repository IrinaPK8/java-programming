package day25_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter start and end: ");

        int start = scan.nextInt();     // start printing from this number
        int end = scan.nextInt();       // end printing at this number

        for (int i = start; i<= end; i++){
            System.out.print(i + " ");
        }

    }
}
