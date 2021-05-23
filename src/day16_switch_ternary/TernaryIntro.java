package day16_switch_ternary;

public class TernaryIntro {
    public static void main(String[] args) {

        String result;
        int score = 40;

        if (score > 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        boolean isGreen = true;
        if (isGreen) {
            System.out.println("Drive");
        } else {
            System.out.println("Stop");
        }

        String result1 = (score > 60) ? "Pass" : "Fail";
        System.out.println(result1);
    }
}
