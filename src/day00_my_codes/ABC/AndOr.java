package day00_my_codes.ABC;

public class AndOr {
    public static void main(String[] args) {
        boolean one =  ('a' != 'z') && false;  // false
                        //true      //false
        boolean two = one || 0==(9-10+1);      // true
                    // false      // true
        System.out.println(two);
    }
}
