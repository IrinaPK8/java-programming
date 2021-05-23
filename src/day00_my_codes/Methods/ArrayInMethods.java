package day00_my_codes.Methods;
import java.util.*;
public class ArrayInMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int [] a = new int[input.nextInt()];
        for (int i = 0; i <a.length; i++) {
            a [i] = input.nextInt();
        }
        method8(a);
    }

    public static void method8 (int [] arr) {
        for (int n : arr) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.println(n);
        }
    }
}
