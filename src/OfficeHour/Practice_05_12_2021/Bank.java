package OfficeHour.Practice_05_12_2021;

public class Bank {

    public static void main(String[] args) {

        BankAccount bankAccountOne = new BankAccount();
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.acctNumber = 2121313311;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(2234));
        // 2234 is a valid pin which shows acct balance when we put it in

    }

}
