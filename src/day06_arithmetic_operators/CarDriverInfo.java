package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String [] args){
        String carModel = "Tesla";
        String driverName = "Irina";
        String licenceNumber = "K123456789.";
        short speed = 150;
        boolean automatic = true;
        char licenseClass = 67;  /// OR char licenceClass = 'C';

        // print like this - Tesla is car model.

        System.out.println (carModel + " is car model.");
        System.out.println (driverName + " is driving " + carModel);
        System.out.println ("License number is " + licenceNumber);
        System.out.println ("Current speed is " + speed + " MPH");
        System.out.println ("Is car automatic? " + automatic);
        System.out.println ("Licence class is " + licenseClass);
        System.out.println (licenseClass + " " + automatic); // put empty String " " in between for different types to be compatible
        System.out.println("====================");

        String str = "My name is ";
        String firstName = "Adam";
        System.out.println(str + firstName);

    }
}
