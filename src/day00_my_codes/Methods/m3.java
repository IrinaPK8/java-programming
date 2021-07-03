package day00_my_codes.Methods;

public class m3 {
    public static void main(String[] args) {
                // int result = method4('z', "zebra");
        System.out.println(method4('z', "zebra"));
    }

    public static int method4(char z, String s) {
        if (s.contains ("" + z)){
            return 1;
        }else {
            return 0;
        }
    }
}
