package OfficeHour.Practice_03_02_2021;

public class Zoo {

    public static void main (String [] args ) {

        String name = "NATIONAL ZOOLOGICAL PARK";
        int established = 1889;
        byte openTime = 9;
        byte closeTime = 9;
        boolean holidaysOpen = false;
        boolean hasAquarium = true;
        int numBigCats = 10;
        int numHoofedAnimals = 20;
        int numOfReptiles = 20;
        int numOfBirds = 200;
        int numOfPrimates = 50;
        int numOfEmployees = 2000;
        double  ticketCostAdults = 30.00;
        double ticketCostKids = 15.00;
        String rules1 = "Visitors ages 6 and older are required to wear face coverings";
        String rules2 = "No visitor shall disturb any exhibit animals by any means, including an attempt to pet, feed, handle or trap exhibit animals";
        String rules3 = "No visitor shall go over, under, between or otherwise cross any guardrail, fence, moat, wall or other safety barrier";
        String rules4 = "No visitor shall throw or toss rocks, trash or other articles into exhibit areas";
        String rules5 = "Pets of any kind are not allowed on Zoo grounds";
        String rules6 = "Visitors may not play loud music within the Zoo, as it may disturb the animals as well as other visitors";

        System.out.println ("****************************************************");
        System.out.println ("* * * * * * * " + name + " * * * * * * *");
        System.out.println ("****************************************************");
        System.out.println ("\t\t\t\tEstablished in "+ established);
        System.out.println ();
        System.out.println ("* * * * * * HOURS OF OPERATION * * * * * *");
        System.out.println ("Monday-Sunday "+ openTime +" AM "+ closeTime +" PM");
                System.out.println ("Open for holidays? --> "+ holidaysOpen);
        System.out.println ("Has aquarium on the site? --> "+ hasAquarium);
        System.out.println ("The Zoo represents "+ numBigCats +" big cats, "+ numHoofedAnimals +" hoofed animals, "+ numOfReptiles +" reptiles, "+ numOfBirds +" birds, "+ numOfPrimates +" primates and many more species");
        System.out.println ();
        System.out.println ("* * * * * * * ENTRANCE FEE * * * * * * *");
        System.out.println ("Adult ticket $"+ ticketCostAdults);
        System.out.println ("Children under 12 years old ticket $"+ ticketCostKids);
        System.out.println ();
        System.out.println ("*****************GENERAL RULES*******************");
        System.out.println ("\t*"+ rules1 + "\n\t*"+rules2 + "\n\t*" + rules3 + "\n\t*" + rules4 +  "\n\t*" + rules5 + "\n\t*" + rules6);
        System.out.println ();
        System.out.println ("*********** ENJOY YOUR VISIT! ***********");

    }
}
