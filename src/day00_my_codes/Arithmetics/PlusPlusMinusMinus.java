package day00_my_codes.Arithmetics;

public class PlusPlusMinusMinus {
    public static void main(String[] args) {
        /* Analyze each step, What is the result numOne, numTwo, and biggest? */
        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
       /*  11    * 3 +    12    +	 12	   % 2
        33	   + 	   12    +     0 */

        System.out.println(numTwo);
        System.out.println(numOne);

        // num2 = 42, num1 = 13
        int biggest = numOne > numTwo ? numOne : numTwo;		// 42
        System.out.println("biggest is: " + biggest);
    }
}
