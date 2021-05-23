package day12_conditional_statement;

public class CompareChars {
    public static void main (String [] args){

        char letter1 = 'A'; // because of char we will be comparing numbers behind this letter in ASCII table - 65
        char letter2 = 'J'; // because of char we will be comparing numbers behind this letter in ASCII table - 74

        boolean equal = letter1 == letter2;    // if they are equal -- false
        boolean larger1 = letter1 > letter2;    // if 1 is larger -- false
        boolean larger2 = letter2 > letter1;    // if 2 is larger -- true

        System.out.println(equal);
        System.out.println(larger1);
        System.out.println(larger2);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass? " + pass); // true


    }
}
