package day00_my_codes.Arrays;

public class Planets {
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;         // asking for array length which is 4
        int y = planets [1].length();   // asking for length of [1] in array (Venus) which is 5 (start counting from 1)
        System.out.println(x + " " + y);
                                      // 4 5
    }
}
