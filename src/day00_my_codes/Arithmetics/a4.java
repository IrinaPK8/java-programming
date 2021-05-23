package day00_my_codes.Arithmetics;

public class a4 {
    public static void main(String[] args) {
        short s = 13 + 3 * (10 - 6) % 2;
                // 10 - 6 = 4,  3 * 4 = 12,  12 % 2 = 0 (остаток),  13 + 0 = 13 --> s = 13
        boolean b = s != 25;      //  13 not equals (!=) 25 --> true
        System.out.println(b);    // under letter b condition is true --> true will be printed out
                                  // NOT LETTER B OR NUMBER 13 --> b IS BOOLEAN --> TRUE OR FALSE RESULT PRINTED ONLY!
    }
}
