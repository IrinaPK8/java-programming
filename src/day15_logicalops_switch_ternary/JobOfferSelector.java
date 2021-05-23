package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {

        // location, salary, isRemote, hasBenefits

        String location = "Washington, DC";
        double salary = 150_000.0;           // _ make it easier to read large numbers
        boolean isRemote = true;
        boolean hasBenefits = true;

        if (location.equals ("Washington, DC") && salary >= 150_000.0 && isRemote && hasBenefits){
            System.out.println("I accept the offer!");
        }else{
            System.out.println("Keep looking, good luck!");
        }

    }
}
