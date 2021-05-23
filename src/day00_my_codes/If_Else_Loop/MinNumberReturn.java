package day00_my_codes.If_Else_Loop;

public class MinNumberReturn {
    public static void main(String[] args) {
        double num1 = 120.0;
        double num2 = 500.0;
        double num3 = 100.0;
        if (num2 > num1 && num1 < num3){
            System.out.println(num1 + " is minimum number");
        }else if (num1 > num2 && num2 < num3) {
            System.out.println (num2 + " is minimum number");
        }else {
            System.out.println (num3 + " is minimum number");
        }

    }
}
