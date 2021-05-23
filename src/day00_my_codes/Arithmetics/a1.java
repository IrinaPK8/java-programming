package day00_my_codes.Arithmetics;

public class a1 {
    public static void main(String[] args) {
        int num = - 5;
        System.out.println(num++ + ",");  // num stays -5 because ++ after num adds 1 at next action
        System.out.println(num = 0);      // now num = 0, we assigned num to 0
        System.out.println("," + --num);  // now num -1 because -- before num makes us deduct right away

                // -5, 0, -1
    }
}
