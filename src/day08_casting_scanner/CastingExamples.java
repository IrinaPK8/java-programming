package day08_casting_scanner;

public class CastingExamples {
    public static void main (String [] args){
        //byte - short - int - long

        // IMPLICIT CASTING - assigning smaller to larger
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;
        int num8 = 3456;
        double num9 = num8;

        System.out.println(num8);                //3456
        System.out.println("num9 = " + num9);   //3456.0

        //EXPLICIT CASTING - assigning larger to smaller

        int n1 = 55;
        byte n2 = (byte) n1;      // casting (...) = telling Java to convert to byte
        System.out.println(n2);

        long n3 = 4444L;
        int n4 = (int) n3;
        System.out.println(n4);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int) num15;  // removes decimals because we assigned to int
        System.out.println(num15);
        System.out.println(num16);

        int num17 = 300;
        byte num18 = (byte) num17; // need to cast because byte range is smaller than 300
        System.out.println(num18);  // result is 44

        char letter = 'a';
        int numLetter = letter; // 97 according to ASCII table
        System.out.println (numLetter);  // if you assign char to int, that number will be assigned

        char ch = 'J';
        int chNum = ch; // 74 according to ASCII table
        System.out.println(chNum);

        double d = 10.5;
        short sh = (short) d; // result 10 because short is not a decimal
        System.out.println(sh);

        int num = (int) 123.45; // 123
        System.out.println(num);

        double dd = 123;    //123.0
        System.out.println(dd);

    }
}
