package day00_my_codes.Arrays;

public class a5 {
    public static void main(String[] args) {
        int [] arr = {12, 15, 18, 22, 39, 42};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        int average = total / arr.length;  // 12+15+18+22+39+42 = 148 / 6 = 24.6
        System.out.println("Average is " + average);
    }
}
