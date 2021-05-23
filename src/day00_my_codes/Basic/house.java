package day00_my_codes.Basic;

public class house {
    public static void main (String [] args){
        String header = "HOUSE FOR SALE:";
        String houseType = "rancher";
        int sqFt = 3500;
        byte numBed = 4;
        byte numBath = 3;
        byte numKitch = 2;
        boolean finishedBasement = true;
        boolean attic = true;
        boolean pool = true;
        boolean deck = true;
        boolean garage = true;
        boolean parkingPad = true;
        double acres = 7.5;
        int price = 785000;
        String address = "ADDRESS:";
        String street = "123 Flower ave";
        String city = "Best, ";
        String stateZip = "MD 00001";
        String neighborhood = "NEIGHBORHOOD:";
        boolean parks = true;
        Byte schoolRate = 10;

        System.out.println (header);
        System.out.println ("The house type is " + houseType);
        System.out.println ("The sq ft is " + sqFt);
        System.out.println ("The number of bedrooms is " + numBed);
        System.out.println ("The number of bathrooms is " + numBath);
        System.out.println ("The number of kitchens is " + numKitch);
        System.out.println ("Finished basement: "+ finishedBasement);
        System.out.println ("Attic space: " + attic);
        System.out.println ("Inground swimming pool: " + pool);
        System.out.println ("Patio/deck: " + deck);
        System.out.println ("Garage space: ” + garage + ");
        System.out.println ("Concrete parking pad: " + parkingPad + " /2 car parking pad");
        System.out.println ("Lot size: " + acres + " acre lot");
        System.out.println ("Price is: $" + price);
        System.out.println (address);
        System.out.println ("Street name: " + street);
        System.out.println ("City name: " + city);
        System.out.println ("State & zip: " + stateZip);
        System.out.println (neighborhood);
        System.out.println ("Are there parks around? " + parks);
        System.out.println ("School rating is " + schoolRate + " out of 10");



    }
}
