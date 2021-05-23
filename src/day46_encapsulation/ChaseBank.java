package day46_encapsulation;

public class ChaseBank {
    public static void main(String[] args) {

        CheckingAccount chAcc = new CheckingAccount();

        chAcc.setBalance(100_000.99);
        chAcc.setAccNumber(123456789L);
        chAcc.setAccHolder("Irina");
        chAcc.setType("free checking");

        System.out.println(chAcc);

    }
}
