package day00_my_codes.Arithmetics;

public class IncrementDecrement {
    public static void main (String [] args){
        int pears = 3;
        int basket = ++pears * 5 / pears -- + --pears;    // 4 * 5 / 4 + 2
        System.out.println (basket);    	//7
        System.out.println (pears);     	//2

        System.out.println ("==============================");
        int a = 5; 	                                        // 5
        int b = a++  +  a--  +  a  *  2  +  a  +  ++a;		// (5 + 6 + 5 * 2 + 5 + 6)
                    // b = 32, a = 6
        System.out.println(a);
        System.out.println(b);

        System.out.println ("==============================");
        int c = 200;                            // 200
        int d = -c++  +  - --c  *  c--  %  2  +  c;
        /*     -200 	+ -(-200) *  200  %  2 +   199
		       -200  +       200  *      0     +   199
	           -200	+        0                 +   199
         */
                            // a = 199, b = - 1
        System.out.println(c);
        System.out.println(d);

        System.out.println ("==============================");
        int x = 300;
        int y = 400;
        int z = x   +   y   -   x * y   +   x / y;
             /*(300  +  400  - 300*400  + 300/400 )
                300  +  400  - 120000   +  0             //(because int does not see decimals)
                // z = -119300, x = 300, y = 400 */
        System.out.println (z);
        System.out.println (x);
        System.out.println (y);
    }
}
