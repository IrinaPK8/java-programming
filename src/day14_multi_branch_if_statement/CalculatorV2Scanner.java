package day14_multi_branch_if_statement;
import java.util.Scanner;
public class CalculatorV2Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");

        double num1 = scan.nextDouble();        // scan because we will be inserting numbers on the bottom
        double num2 = scan.nextDouble();

        System.out.println("Enter operator: +, -, *, /");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator - " + operator);
        }
    }
}
