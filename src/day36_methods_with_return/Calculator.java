package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(10, 12));
        System.out.println("10.0 + 12.0 = " + add(10, 12));
        System.out.println(multiply(5, 10));
        System.out.println(minus(50, 25));
        System.out.println(divide(100, 4));
    }
    public static double add(double num1, double num2){
        double result = num1 + num2;
        return (result);
    }
    public static double multiply(double num1, double num2){
        double result = num1 * num2;
        return (result);
    }
    public static double minus(double num1, double num2){
        double result = num1 - num2;
        return (result);
    }
    public static double divide(double num1, double num2){
        double result = num1 / num2;
        return (result);
    }
}
