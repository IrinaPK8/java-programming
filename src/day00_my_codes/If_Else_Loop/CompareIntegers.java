package day00_my_codes.If_Else_Loop;

public class CompareIntegers {
    public static void main(String[] args) {
        /* Write a program that will ask the user to enter three numbers.
If the numbers are the same print “All integers are the same”

If they are not equal, print which is the biggest value of the three numbers
—> If there is two numbers which are the largest print the one that came first
> Input: 3,2,6
> Output: The biggest number from 3, 2 and 6 is: 6 */

        double num1 = 4.0;
        double num2 = 5.0;
        double num3 = 3.0;

        if (num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("All integers are the same");
        }else if (num1 > num2 && num1>num3){
            System.out.println ("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println ("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num2);
        }else {
            System.out.println ("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num3);
        }

    }
}
