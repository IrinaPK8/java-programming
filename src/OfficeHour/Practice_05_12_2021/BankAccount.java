package OfficeHour.Practice_05_12_2021;

public class BankAccount {
    // template class/ blue print where we just store variables

    String accountHolderName;
    int pin;
    double balance;
    long acctNumber;

    public double getBalance(int inputPin){

        if (pin == inputPin){
            return balance;

        }
        return -1;
    }
    }

