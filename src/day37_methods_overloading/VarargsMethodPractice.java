package day37_methods_overloading;

public class VarargsMethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("Hi", 3, '|'));
    }

    public static String repeatString(String word, int times, char delimeter) {
        String retValue = "";
        for (int i = 1; i <= times; i++) {

            // if ( i == times) { retValue += word; }
            retValue += word + delimeter;
        }
        return retValue;
    }
}
