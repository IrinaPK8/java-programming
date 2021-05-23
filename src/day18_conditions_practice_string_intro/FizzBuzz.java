package day18_conditions_practice_string_intro;

public class FizzBuzz {
    public static void main(String[] args) {

        /**
         * "FizzBuzz" -> when number is divisible by 3 and(&&) 5
         * "Fizz" -> when number is divisible by 3
         * "Buzz" -> when number is divisible by 5
         */

        int num = 15;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        }else {
            System.out.println(num);
        }
    }
}
