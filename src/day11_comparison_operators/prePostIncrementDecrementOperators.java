package day11_comparison_operators;

public class prePostIncrementDecrementOperators {

    public static void main (String [] args){

        // PRE INCREMENT
        int num1 = 10;
            // ++num1
            // int num2 = num1;
        int num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2); // first it takes num1 and increases it by 1, then assigns it to num2

        // POST INCREMENT
        int num3 = 8;
            // num3++
            // int num4 = num3;
        int num4 = num3++;
        System.out.println(num3);
        System.out.println(num4);

        int apples = 5;         // apple Was 5, but on the second line,
                                // we did ++,, means we add 1 to the apple now,
                                // so the java will accept apple as 6, not 5
        int basket = ++apples;
        System.out.println("apples " + apples);
        System.out.println("basket " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi " + kiwi);
        System.out.println("basket kiwi " + kiwiBasket);

        int myNumber = 44;
        myNumber ++;
        System.out.println(myNumber); //44
        ++myNumber;
        System.out.println(myNumber); //46

        myNumber = 33;
        System.out.println(myNumber++); //33
        System.out.println(myNumber);      //34

        int myNumber1 = 99;
        int yourNumber = myNumber1++; // assign myNumber to yourNumber first then add 1
        System.out.println("myNumber1 is = " + myNumber1);
        System.out.println("yourNumber is = " + yourNumber);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;      // 50 + 23
        System.out.println(c);

    }
}