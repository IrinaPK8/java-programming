package day06_arithmetic_operators;

public class ArithmeticOperators {
    public static void main (String [] args){
       /*  ----------EXAMPLE----------
        int i = 10;
        int j = 5:
        int k = 11;

        int addition = i+j;         // 15
        int substraction = i-j;     // 5
        int multiplication = i*j;   // 50
        int division = i/j;         // 2
        int mod = i%j;              // 0 (remainder when i is divided by j)
        int mod = k%j;              // 1 (remainder when k is devided by j)

        NOT CONCATENATON ANYMORE, BUT ARITHMETIC!!!
        */
        System.out.println (5+10);
        System.out.println (10-3);
        System.out.println (3*3);
        System.out.println (15/5);
        System.out.println (17%5); // 2 remainder if we divide 17 by 5

        System.out.println ("======================");

        int i = 10;
        int j = 5;
        int k = 11;
        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(k % j);

        System.out.println(-2*-2); // WORKS WITH NEGATIVES TOO
        System.out.println(3*-3);  // WORKS WITH NEGATIVES TOO

        System.out.println ("======================");

        int chairs = 4 + 2;
        System.out.println(chairs);

        int spoons = 10 + 20 + 12 +0;
        System.out.println("There are " + spoons + " spoons in kitchen.");
        }
}
