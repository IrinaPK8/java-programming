package day13_conditional_statements;
public class ATMPincodeProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to the Bank ATM\n#######################");

        int secretPin = 8888;
        int inputPin = 8888;

        if (secretPin == inputPin){
            System.out.println("Welcome to the Bank\nACTIONS: \n\t# withdraw\n\t# check balance\n\t# deposit");
        }else {
            System.out.println("Incorrect PIN " + inputPin + "\nPlease, try again");
        }

        System.out.println("#######################");
        System.out.println("Thank you for using the Bank!");
    }
}
