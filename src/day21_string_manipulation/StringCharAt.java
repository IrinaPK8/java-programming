package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        /*System.out.println(word.charAt(4)); - will show error when trying to
        print out because there are 0123 positions in word java only
         */

        System.out.println(word + " - " + word.length());       // 4

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        System.out.println("second letter: " + company.charAt(1));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);
        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh + " " + eighth);

        String withSpaces = first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh + " " + eighth;
        System.out.println("with Spaces = " + withSpaces);
    }
}
