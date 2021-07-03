package day00_my_codes.Basic;

public class Casting {
    public static void main(String[] args) {
        int a = 5;
        //  byte b = a; <-- cannot type like this - need to cast
        //  even if number 5 fits into byte, java sees it as int
        //  int is more than byte and needs to be casted
        byte b = (byte) a;
        System.out.println(b);
    }
}
