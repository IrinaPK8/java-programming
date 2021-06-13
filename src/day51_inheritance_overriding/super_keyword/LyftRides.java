package day51_inheritance_overriding.super_keyword;

import org.testng.Assert;

public class LyftRides {
    public static void main(String[] args) {

        Lyft lyftRide = new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        LyftLux lyftLuxRide = new LyftLux();

        System.out.println("Lyft ride for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("LyftXL ride for 5 miles = $" + Math.round(lyftXLRide.calculateRate(5)));
        System.out.println("Lyft Lux ride for 5 miles = $" + lyftLuxRide.calculateRate(5));

    }
}
