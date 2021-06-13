package day48_constructore_static.static_examples;

public class Calculator {

    public static void add(int num1, int num2){     // STATIC
        System.out.println(num1 + num2);
    }

    public void multiply (int num1, int num2){      // NON-STATIC
        System.out.println(num1 * num2);
    }

}
