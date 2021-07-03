package day00_my_codes.Switch;
import java.util.Scanner;

public class sw1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // String str = in.nextInt(); --> COMPILE ERROR --> cannot store int to String
        String str = in.next();
        
        int num = 0;
        switch (str) {
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;
        }
        System.out.println(num);
    }
}
