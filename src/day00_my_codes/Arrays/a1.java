package day00_my_codes.Arrays;

import java.util.Arrays;

public class a1 {
    public static void main(String[] args) {

        int [] intArr = {15, 30, 45, 60, 75};
        intArr [2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));
    }
}
