package day47_constructors;

public class AddressList {
    public static void main(String[] args) {

        Address cybertekAddress = new Address ();
        cybertekAddress.setStreet("7925 Jones Branch dr, suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek school address: " + cybertekAddress.toString());

        cybertekAddress.setStreet("7925 Jones Branch dr, suite 3200");  // setting up new address
        System.out.println("Address after update " + cybertekAddress.toString());

        System.out.println("Street info = " + cybertekAddress.getStreet()); // print street only


        // ADDING CONSTRUCTOR METHOD TO ADDRESS
        Address newAddress = new Address();
        // because there is constructor method in another class --> it CALLS THAT CLASS AUTOMATICALLY
        newAddress.setStreet("7925 Jones Branch dr, suite 3300");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22182");
        System.out.println("newAddress.toString() = " + newAddress.toString());

        Address papaJon = new Address("8501 New Tyco rd", "Vienna", "VA", "22182");



    }
}
