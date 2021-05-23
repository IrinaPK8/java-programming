package day46_encapsulation;

public class CheckingAccount {

    private double balance;
    private long accNumber;
    private String accHolder;
    private String type = "checking";

    public void setAcctInfo (long accNumber, String accHolder, double balance, String type){

        return;
    }

    // SHORTCUT TO GENERATE SETTER AND GETTER METHODS FOR ALL VARIABLES
    // right click -> generate -> Getter and Setter -> select all -> ok


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }
    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accNumber=" + accNumber +
                ", accHolder='" + accHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
