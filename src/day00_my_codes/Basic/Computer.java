package day00_my_codes.Basic;

public class Computer {
    public static void main (String [] args ) {

        String brand = "HP";
        String processor = "Intel Core i5";
        byte ramMemory = 32;
        int storageMemory = 256;
        boolean hasWifiCard = true;
        String description = "HP ZBook Create G7 Notebook PC, Customizable";
        double price = 2868.39;
        String color = "Silver";
        byte numberOfMonitors = 1;
        int numberOfUsbSlots = 3;
        boolean hasUsb3_0 = false;

        System.out.println ("The computer brand is " + brand + ".");
        System.out.println ("It has " + processor + " processor.");
        System.out.println ("It's RAM is " +ramMemory + " GB and storage memory size is " + storageMemory + " GB.");
        System.out.println ("Does it have WiFi card? --> " + hasWifiCard + ".");
        System.out.println ("It's a " + description + ".");
        System.out.println ("PRice: "+price + ".");
        System.out.println ("Color: "+color + ".");
        System.out.println ("It has "+numberOfMonitors + " monitor.");
        System.out.println ("It has " +numberOfUsbSlots + " USB slots.");
        System.out.println ("Does it have UBS 3.0 port? --> " + hasUsb3_0);
    }


}
