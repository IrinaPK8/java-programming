package day18_conditions_practice_string_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        switch (num1) {
            case 10:
                num1++;         // 11
                num2 += 10;     // 21
                break;          // !! break is here  !!
            case 20:
                num1 += num2;   // 30
                num2--;         // 9
            case 30:            // NO BREAK BETWEEN CASES --> will fall through!!!
                num1 = 0;       // 0
                num2 -= 3;      // 6
                break;
        }
        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
    }
}
