package day00_my_codes.Do_While_Loop;

public class d1 {
    public static void main(String[] args) {
        String word = "java";
        int a = 0;

        do {
            System.out.println(word.charAt(a));
            a++;
        }while (a > word.length());
    }
}
