package day00_my_codes.Methods;

public class m5 {
    public static void main(String[] args) {
        String str = method7("on the weekend", 20);
        System.out.println(str);
    }

    public static String method7 (String str, int s){
        if (s < 10) {
            str = str.substring(8);
        }else {
            if (str.length() > s) {
                str = "weekday";
            } else if (s > 10){
                str = str.substring (7);
            }
        }
        return str;
    }
}
