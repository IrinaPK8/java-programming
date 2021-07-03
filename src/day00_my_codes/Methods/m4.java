package day00_my_codes.Methods;

public class m4 {
    public static boolean method5(String str) {
        boolean check = true;
        if (str.isEmpty()){
            check = false;
            System.out.println("empty");
        }
        if (str.contains("a")){
            System.out.println("contains a");
            check = false;
        }else if (str.contains("z")) {
            System.out.println("contains z");
            check = false;
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.println(method5("apple"));
    }
}
