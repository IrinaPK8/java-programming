package OfficeHour.Practice_04_21_21;

public class PalindromeReverse {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1234321));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;

        while (number != 0 ){
         int lastDigit = temp %10;
         reverse = lastDigit;
         temp /= 10;
            System.out.println(reverse);
        }
        return reverse == number;
    }
}
