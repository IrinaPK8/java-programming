package day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {

        int expLast4SSN = 1234;
        int expPinCode = 4321;
        int last4SSN = 1111;
        int pinCode = 2222;
        if (expLast4SSN == last4SSN && expPinCode == pinCode){
            System.out.println("Authentication successful");
        }else {
            System.out.println("Authentication unsuccessful");
            if (expLast4SSN == last4SSN && expPinCode != pinCode){
                System.out.println("Pin Code does not match");
            }else if (expLast4SSN != last4SSN && expPinCode == pinCode){
                System.out.println("Last 4 SSN do not match");
            }else {
                System.out.println("Pin Code and last 4 SSN do not match");
            }
            }
        }
    }
