package day00_my_codes.Methods;

public class FalseOrTrue {

    public static void main(String[] args) {
        System.out.println(method5("apple"));
    }

    public static boolean method5 (String str) {
        boolean check = true;
        if (str.isEmpty()){
            check = false;
        }
        if (str.contains("a")) {
            check = false;
        } else if (str.contains("z")) {
        check = false;
        }
        return check;
    }
}
