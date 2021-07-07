package day00_my_codes.Arithmetics;

public class a10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=3){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
