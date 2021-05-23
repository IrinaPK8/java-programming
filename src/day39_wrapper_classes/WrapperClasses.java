package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        num += 10;
        System.out.println(num);

        // WAYS TO CREATE WRAPPER CLASS
        Integer n = new Integer(500);   // n -> name, 500 -> value  // assigning value directly
        System.out.println("is n = 500? " + n.equals(500));
        System.out.println((n + 300));

        Integer n2 = 1000;              // assigning value directly
        System.out.println(n2 / 50);
        // how to convert n2 to string
        String numStr = n2 + "";        // convert to string --> concatenate with "" --> simplest way
        String numSt = n2.toString();   // OR using .toString --> convert to string --> assign to numSt
        System.out.println("num Str = " + numStr);
        System.out.println("num St =" + numSt);

            // DECLARING WRAPPER CLASSES --> create object and assign the value
        Byte b1 = new Byte((byte)5);        // casted it at the same time
        Byte b2 = 10;

        Short sh1 = new Short((short)40);   // casted it at the same time
        Short sh2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 = 200;

        Long l1 = new Long(300L);
        Long l2 = 3455L;

        Float f1 = new Float (5.2F);
        Float f2 = 45.3F;

        Double d1 = new Double (345.3);
        Double d2 = 234.5;

        Character c1 = new Character ('Q');
        Character c2 = 'V';

        Boolean bl1 = new Boolean (true);
        Boolean bl2 = false;

    }
}
