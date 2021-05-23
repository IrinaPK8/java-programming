package day00_my_codes.Arithmetics;

public class a5 {
    public static void main(String[] args) {
        byte b = 104;
        boolean check = b < 100; // condition is false --> 104 is not less than 100

        if (check) {
                // in if statement condition needs to be true to print out --> here condition is false --> moving to else then
            b -= 100;
        }else {   // in case condition is false (our case now) --> print that b = 50
            b = 50;
        }
        System.out.println(b);  // 50
    }
}
