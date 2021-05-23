package day00_my_codes.Methods;

public class QuizThree {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        int n = 5;

        for (int i = 0; i < 5; i++) {
            n +=i;
        }
        System.out.println(n);
    }
}
