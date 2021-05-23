package day00_my_codes.Basic;

public class Apartment {
    public static void main (String [] args){
        int buildingNum = 100;
        String streetName = "Main st";
        String city = "Silver Spring";
        char state1 = 77;
        char state2 = 68;
        String nameOwner = "John Doe";
        String phoneOwner = "123-456-7890";
        int numUnits = 300;
        char numFloors = 56;
        int numTotalResidents = 678;
        double averUnitSize = 1300.00;
        double monthlyRent = 1800.00;
        int numWashersDryers = 600;
        boolean hasBasement = true;
        boolean hasAvailUnits = true;
        boolean hasAc = true;
        int numParkingSpaces = 600;
        boolean wheelchairAccess = true;
        boolean allowPets = true;
        boolean hasPool = true;
        boolean hasTennisCourt = true;
        boolean hasGym = true;
        byte lengthLease = 12;
        boolean nearGasStation = true;
        byte numReviewStars = 5;
        System.out.println ("~~~~~~~~~~~LUXURY APARTMENTS~~~~~~~~~~~");
        System.out.println ("Address: " + buildingNum + " " + streetName + ", " + city + " " + state1 + state2);
        System.out.println ("Name of the owner: " + nameOwner);
        System.out.println ("Contact info :" + phoneOwner + " cell 24/7");
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println ("Total number of units in the building: " + numUnits);
        System.out.println ("Number of floors in the building: " + numFloors);
        System.out.println ("Total number of residents: " + numTotalResidents);
        System.out.println ("Average unit size: " + averUnitSize);
        System.out.println ("Monthly rent: $" + monthlyRent);
        System.out.println ("Number of washers/dryers in the building: " + numWashersDryers);
        System.out.println ("Numer of floors in the building: " + numFloors);
        System.out.println ("Units available for rent? --> " + hasAvailUnits);
        System.out.println ("Central AC in eachunit? --> " + hasAc);
        System.out.println ("Number of parking spaces: " + numParkingSpaces);
        System.out.println ("Wheelchair accessible? --> " + wheelchairAccess);
        System.out.println ("Pets allowed? --> " + allowPets);
        System.out.println ("Has pool? -->" + hasPool);
        System.out.println ("Has a tennis court? -->" + hasTennisCourt);
        System.out.println ("Has gym? -->" + hasGym);
        System.out.println ("Min length of lease: " + lengthLease + " months");
        System.out.println ("Gas Staton within 5 miles? --> " + nearGasStation);
        System.out.println ("Is there basement in the building? --> " + hasBasement);
        System.out.println ("Average rating :" + numReviewStars + " stars out of 5");

        System.out.println ("Monthly rent after 3 years is " + (monthlyRent * 0.9));                            	// (discount 10% off original rent)
        System.out.println ("Monthly rent after 6 years is " + (monthlyRent * 0.8));                            	// monthly rent after 6 years (discount 20% off original rent)
        System.out.println ("Average number of residents per unit is " + (numTotalResidents / numUnits));   //Average number of residents per unit (total residents / number of units)
        System.out.println ("Average number of parking spots per unit is " + (numParkingSpaces / numUnits));   // Average number of parking spots per unit ( parking spots / units)
        System.out.println ("Average number of units per floor is " + (numUnits / numFloors));                  	// Average number of units per floor ( units / number of floors)

    }

}
