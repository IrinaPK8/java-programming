package day49_static;

import OfficeHour.Practice_05_12_2021.Bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "Art";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "Irina";
        wife.showBalance();
        wife.spend(350.0);
        wife.showBalance();
        System.out.println(BankAccount.balance);
    }
}
