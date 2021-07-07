package day00_my_codes.Arrays;

public class a6 {
    public static void main(String[] args) {
        int [] arr = {12, 15, 18, 22, 39, 42};

        String total = "";

        for (int i = 0; i < arr.length; i++) {
            total = total + " " + arr[i];
        }
        System.out.println(total);

    }
}
