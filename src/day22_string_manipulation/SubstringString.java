package day22_string_manipulation;

public class SubstringString {
    public static void main(String[] args) {
        String country = "Belize";
        System.out.println(country.substring(2, 5));     // counts indexes 2, 3 and 4. !!!! 5 IS NOT INCLUDED !!!
        System.out.println(country.substring(3, 5));     // counts indexes 3 and 4. !!!! 5 IS NOT INCLUDED !!!
        System.out.println(country.substring(0, 3));     // counts indexes 0, 1 and 2. !!!! 5 IS NOT INCLUDED !!!

        String word = "hello";
        System.out.println(word.substring(0, 2));        // he
        System.out.println(word.substring(1, 4));       // ell
        System.out.println(word.substring(2, 4));       //ll
           // System.out.println(word.substring(-1, 6));   - WHEN STRING INDEX IS OUT OF BOUNDS - ERROR !!!!
        System.out.println(word.substring(0));          // entire word from 0 to the last index
        System.out.println(word.substring(4));          // o - starts from 4 index

        String wordd = "java is fun";
        System.out.println(wordd.substring(0, 4));      // java
        System.out.println(wordd.substring(0, 7));      // java is
        System.out.println(wordd.substring(5, 7));      // is
        System.out.println(wordd.substring(8, 11));     // fun
                // System.out.println(wordd.substring(0, 45));      - ERROR, OUT OF BOUNDARIES

        System.out.println(wordd.substring(5));         // prints from 3 until end
        System.out.println(wordd.substring(8));


    }
}
