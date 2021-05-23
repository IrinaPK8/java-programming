package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) { // using custom method from another class
               // true result from isNullOrEmpty method is given to if statement, so it will print message below
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println(StringUtils.isPalindrome("civic")); // true
        System.out.println(StringUtils.isPalindrome("Kayak"));
        System.out.println(StringUtils.isPalindrome("cybertek"));

        System.out.println("Reversed String = " + reverse("java"));
        System.out.println(reverse("Sunday"));

    }
}
