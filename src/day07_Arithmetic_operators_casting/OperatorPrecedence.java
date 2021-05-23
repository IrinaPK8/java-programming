package day07_Arithmetic_operators_casting;

public class OperatorPrecedence {

    public static void main (String [] args){
        System.out.println(10 + 5);         // 15
        System.out.println(10 + 5 - 3);     //12
        System.out.println(10 - 5 +3);      //8
        System.out.println(10 - (5 + 3));   //2
        System.out.println (2 * 3);         // 6
        System.out.println (2 * 3 / 3) ;    //2
        System.out.println (20 / (2 * 2));  // 5
                // System.out.println (10 / 0); - ERROR< CANNOT DIVIDE BY ZERO
        System.out.println(2 + 5 *3);       //17
        System.out.println((2 + 5) *3);     //21

        int num1 = 10;
        int num2 = 2;
        System.out.println(num1 / num2);

        System.out.println(10 / 3);     // 3 - Java will show whole number result and will not show decimals in this case
        System.out.println(5/ 2);       // 2 - Java will show whole number result and will not show decimals in this case

        // if you need mathematical precision, do not divide integers/whole numbers. USE DOUBLE or FLOAT!
        System.out.println(10.0 / 3.0);     //3.333
        System.out.println(5.0/2.0);        // 2.5

    }
}
