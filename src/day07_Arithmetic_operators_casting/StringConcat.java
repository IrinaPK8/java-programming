package day07_Arithmetic_operators_casting;

public class StringConcat {
    public static void main (String [] args){
        System.out.println("java" + 5 + 3);  // java53 - because it STARTS with STRING - when we put String, it changes the next data into string
        System.out.println(5 + 3 + "java");  // 8java - because it does not start with String and numbers will be added first
        System.out.println("java" + (5+3));  // java8 - because addition in () will be done first
        System.out.println(5 + (3 + "java"));  //  () will be calculated first (JAva thinks it is String), then number 5 will be written

        System.out.println("hello" + 1 + 2 +3);  // hello123
        System.out.println("hello" + (1 + 2 +3));  //hello6 - in () calculations will be done first
        System.out.println("hello" + 1 + (2 +3));  // hello15

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2); //hellofriends
        System.out.println(str1 + " " + str2);  // hello friends - because " " is added

        int num1 = 7;
        int num2 = 8;
        System.out.println (num1 + num2);  // will ad numbers because no String here
        System.out.println (num1 + " " + num2); // 7 8 because there is String gap " " - when we put String, it changes the next data into string
        System.out.println("" + num1 + num2); // 78 - when we put String, it changes the next data into string
        System.out.println(num1 + "" + num2);  // 78 when we put String "" without space within, it will nod add arithmetically

        char chr1 = 'a'; // 97 according to Ascii table
        char chr2 = 'b'; // 98 according to Ascii table
        System.out.println(chr1 + chr2); // math 97+98 equals 195
        System.out.println(chr1 + "" + chr2); // empty String breaks math -->ab
        System.out.println("" + chr1 + chr2); // empty String makes it all String
    }
}
