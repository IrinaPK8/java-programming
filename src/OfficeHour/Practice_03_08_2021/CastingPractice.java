package OfficeHour.Practice_03_08_2021;

public class CastingPractice {
    public static void main (String [] args){

        // byte - short - int - long - float - double

        byte b = 10;
        short s = b; // no need to cast because short is bigger than byte
        byte b2 = (byte) s; // need to cast because s byte b2 is smaller that short s

        double d = 5.3;
        int i = (short) d; // going from bigger data type to smaller - not gonna work, need to cast

        float f = 3.54F;
        float f2 = (float) 3.54; // without (float) compiler takes it as double and double cannot go to float because double is bigger, casting to float is needed

        float f3 = 5;  // float is int now because 5 is whole, not decimal number, no need to add F
        float f4 = 5.5F; // compiler reads it (without F) as double because it's a decimal number, F is needed
        long l = 22313;  // number is read as int
        long l2 = 312312313323L; // L is needed for compiler to see it as long, otherwise it will see it as int and int is smaller and cannot be long

        System.out.println(l);
        System.out.println((double)l);      // if casted like this, then l (which is long originally) gets .0 decimals when printed
        System.out.println((float)l);       // if casted like this, then l (which is long originally) gets .0 decimals when printed
        System.out.println(l2);

        double million = 1_000_000;
        System.out.println(million);

    }
}
