package day00_my_codes.String_Manipulations;

public class s1 {
    public static void main(String[] args) {
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game"); // - 1 result because no such index found

        if (index1 == index2){
            System.out.println(index1);
        }else {
            System.out.println(index2);
        }
    }
}
