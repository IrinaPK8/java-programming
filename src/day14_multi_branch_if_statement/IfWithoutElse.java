package day14_multi_branch_if_statement;
public class IfWithoutElse {
    public static void main (String [] args){
        int year = 2020;
        if (year == 2020) {
            System.out.println("Covid19 pandemic year\nWear mask and keep 6 ft distance");
        }
        System.out.println("Keep coding Java");
        // this line will be printed regardless because it is not part of condition

        System.out.println("===============================");

        String country = "USA";
        if (country.equals ("USA")) {        // use .equals for String only!!! instead of ==
            System.out.println("The capital is Washington, DC");
        System.out.println("White house is on Pennsylvania ave");}

        System.out.println("Welcome to the " + country);
    }
}
