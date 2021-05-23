package OfficeHour.Practice_03_22_2021;

public class OperatorsExample {
    public static void main(String[] args) {

       /*  Analyze each step, What is the result of a, b, and c? */

        int a = 3,  b = 2;

        long c = (a--    +    b)    *    2    /    3    %    2;

               /* (3     +    2)    *    2    /    3    %	  2
                         5          *    2    /    3    %     2
                                    10        /    3    %     2
               (because int won’t show decimals)   3    %     2			// remainder 1	*/

        // if I want to cast - short c = (short)(a-- + b) * 2 / 3 % 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
