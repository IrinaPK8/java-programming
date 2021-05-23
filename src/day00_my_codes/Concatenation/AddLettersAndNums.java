package day00_my_codes.Concatenation;

public class AddLettersAndNums {
    public static void main(String[] args) {
        String a = "123";      // will print as 123 because it is String in""
        String b = 5 + 4 + a;  // will add 5 and 4 first =9 and then припишет nj the end 123 (because it was String)
        System.out.println(b);  // 9123
    }
}
