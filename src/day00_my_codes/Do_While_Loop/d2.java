package day00_my_codes.Do_While_Loop;

public class d2 {
    public static void main(String[] args) {
        String str = "The whole time it was raining.";

        do {
            System.out.print(str.charAt(0));
            str = str.substring(3);
        }while (!str.isEmpty());
    }
}
