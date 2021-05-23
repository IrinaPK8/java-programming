package day18_conditions_practice_string_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 =100;
        num2 = 100;
        num3 = 11;

        if (num1 > num2 && num1 > num3) {
            // condition is not valid num1 equals num2, not equal or less
            // will not be printed
            System.out.println("largest value is " + num1 );
        }else if (num2 > num1 && num2 > num3 ){
            // condition is not valid num2 equals num1, not equal or less
            // will not be printed
            System.out.println("largest value is "+ num2);
        }else {
            System.out.println("largest value is "+ num3);
        }
    }
}
