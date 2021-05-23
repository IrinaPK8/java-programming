package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {

        double bonus = 0;
        double salesAmount = 2100;

        if (salesAmount <= 1000) {
            bonus = 50;
            System.out.println("Good job! You qualify for bonus $" + bonus + "!");
        } else {
            bonus = 100;
            System.out.println("Great job! You qualify for bonus $" + bonus + "!");
        }
    }
}
