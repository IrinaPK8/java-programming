package day00_my_codes.Arithmetics;

public class a8 {
    public static void main(String[] args) {
        int num = 9;
        if (num++ == 10) {      // when code in this line, it checks if condition is true AND PERFORMS ++ ACTION
            System.out.println("Hello world " + num);
        }else {
            System.out.println("Hello Universe " + num); // here num is already 10
        }
    }
}
