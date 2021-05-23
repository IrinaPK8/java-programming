package day00_my_codes.Ternary;

public class Decimal {
    public static void main(String[] args) {
        double decimal = 13.142;
        int whole = decimal < 20 ? 20 : 10;  // condition --> если decimal меньше 20 --> true
                                             // 20 will be printed out (10 printed if condition is false)
        System.out.println(whole);
    }
}
