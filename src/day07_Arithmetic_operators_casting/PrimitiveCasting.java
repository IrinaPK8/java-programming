package day07_Arithmetic_operators_casting;

public class PrimitiveCasting {

    public static void main (String [] args){
       /* int n1 = 4;
        byte b1 = n1;
        ERROR because int is larger data type than byte
        TO MAKE IT WORK WE NEED TO CAST IT  -  ()
        int n1 = 4;
        byte b1 = (byte)n1; - now line (byte)n1
        will CAST/CONVERT n1 to byte. Then assign the value

                    byte b2 = 55;
                    int n2 = b2;
                    This will work, because we assigning small data type to large.
                    It will automatically cast/convert.
        */

        int num1 = 100;
        byte b1 = (byte)num1;           //100
        short shNum1 = (short)num1;     //100
        long lNum1 = num1;
        System.out.println(b1);
        System.out.println(shNum1);
        System.out.println(lNum1);

    }
}
