package day00_my_codes.String_Manipulations;

public class s2 {
    public static void main(String[] args) {
        String a = "today I will go to the beach";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");

        String result = b && c ? "go" : "don't go";
        System.out.println(result);
    }
}
