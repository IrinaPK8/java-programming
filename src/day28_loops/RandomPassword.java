package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();  // helps generate random number
        String password = "";

        for (int i = 1; i <= 8; i++) {                  // i<=8 means password will be 8 characters long
            int index = random.nextInt(71);             // giving us random number between 0-70 (71 is exclusive)
                         // we store this number at index and then read it with charAt
            System.out.print(source.charAt(index));     // --> this gives char
                // source.substring(index, index + 1);  // this gives String
                // system.out.println(random.nextInt(source.length()));
                // add the char to password variable using +=
            password += source.charAt(index);
        }

        System.out.println("\nYour password = " + password);

    }
}
