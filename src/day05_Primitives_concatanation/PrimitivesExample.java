package day05_Primitives_concatanation;

public class PrimitivesExample {
    public static void main (String [] args){
        //*******WHOLE NUMBERS/INTEGER TYPES*******
        byte byteValue = 100;
        short shortValue = -10000;
        int intValue = 21235124;
        long longValue = 5248957231462331233L; // long variable value -> we put L at the end to tee Java it is long number. Otherwise Java thinks it is int.

        //********DECIMAL NUMBERS/FLOATING POINT TYPES*******
        float floatValue = 2345.55F; // float variable value -> we put F at the end to tee Java it is float number. Otherwise Java thinks it is double.
        double doubleValue = 23554323234235.4334; // 23554323234235.4334D is also valid // E13 in the result means в 13 степени

        //**********CHARACTER TYPE**********
        char charValue = '$'; // single character in single quotes
        char firstLetterOfName = 'I';
        char randomLetter = 'k';

        //********* BOOLEAN - true or false *******
        boolean booleanValue = true; // no quotes, always lower case true or false
        boolean booleanValuee = false;

        System.out.println (byteValue); //NO " "
        System.out.println (shortValue); //NO " "
        System.out.println (intValue); //NO " "
        System.out.println (longValue); //NO " "
        System.out.println (floatValue); //NO " "
        System.out.println (doubleValue); //NO " "
        System.out.println (charValue); //NO " "
        System.out.println (firstLetterOfName); //NO " "
        System.out.println (randomLetter); //NO " "
        System.out.println (booleanValue); //NO " "
        System.out.println (booleanValuee); //NO " "


    }
}
