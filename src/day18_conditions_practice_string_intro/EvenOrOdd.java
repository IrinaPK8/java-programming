package day18_conditions_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {

        int num = -9;

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else if (num % 2 > 0 || num % 2 < 0) {
            System.out.println(num + " is odd");
        }
    }
}
