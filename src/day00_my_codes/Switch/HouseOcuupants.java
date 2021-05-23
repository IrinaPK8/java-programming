package day00_my_codes.Switch;

public class HouseOcuupants {
    public static void main(String[] args) {
        /** [House Occupants]
         Given a house type (String) print out the number of max occupants (int)
         Tree house: 1
         Mobile home: 2
         Apartment: 4
         Town house: 6
         Villa: 8
         Mansion: 10
         -> Try to use variables instead of printing multiple times  */

        String houseType = "Tree house";
        int maxOccupants = 0;
        switch (houseType) {
            case "Tree house":
                maxOccupants = 1;
                System.out.println(houseType + " - maximum occupants: " + maxOccupants);
                break;
            case "Mobile home":
                maxOccupants = 2;
                System.out.println(houseType + " - maximum occupants: " + maxOccupants);
                break;
            case "Apartment":
                maxOccupants = 4;
                System.out.println(houseType + " - maximum occupants: " + maxOccupants);
                break;
            case "Townhouse":
                maxOccupants = 6;
                System.out.println(houseType + " - maximum occupants: " + maxOccupants);
                break;
            case "Villa":
                maxOccupants = 8;
                System.out.println(houseType + " - maximum occupants: " + maxOccupants);
                break;
            case "Mansion":
                maxOccupants = 10;
                System.out.println(houseType + " - maximum occupants: " + maxOccupants);
                break;
        }

    }
}
