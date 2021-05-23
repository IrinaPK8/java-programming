package day00_my_codes.String_Manipulations;

public class Popcorn {
    public static void main(String[] args) {
        String z = "popcorn";
        z = z.substring(1, 8);
              // in word popcorn there are only 7 letters, so (1, 8) is OutOfBounds
              // if statement will not run because there is mistake above
        if (z.equals("opcor")){
            System.out.println(z.length());
        }else {
            System.out.println(z.replace("o, ", "a"));
        }
    }
}
