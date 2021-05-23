package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("What's his name? --> " + fullName());
        System.out.println("Is he married? --> " + isMarried());
        System.out.println("How old is he? --> " + age());
        System.out.println();
        System.out.println(getRandomYear());

        // Storing into variables
        String name = fullName();
        boolean married = isMarried();
        int age = age();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);


    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int age(){
        return 30;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
