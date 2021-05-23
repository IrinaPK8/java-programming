package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretPinCode = 1234;
        int pinCode;

        do {
            System.out.println("Enter pin code: ");
            pinCode = scan.nextInt();
        }while (pinCode != secretPinCode);     // as long as pinCode != secretPinCode --> keep on asking to Enter pin code
        System.out.println("Welcome to your account");
    }
}
