package day00_my_codes.Switch;

public class HouseBuyer {
    public static void main(String[] args) {
        /*You are buying a new house and need to collect information about the houses in a specific area.
        You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5),
        if it is a gated community or not, allow pets or not.
                Make variables for all of that information.
                Given empty defaults for all except the neighborhood name.
                Print the information once at the end.
        Data based on neighborhood name: name - Hills, average price - 89,000, rating - 4.0, gated - no, allow pets - yes
        name - Oaks, average price - 75,000, rating - 3.5, gated - no, allow pets - yes
        name - Highland, average price - 150,000, rating - 4.5, gated - yes, allow pets - no
        name - Canyon, average price - 201,000, rating - 4.8, gated - yes, allow pets - yes */

        String name = "Canyon";      // "Oaks"  "Highland"  "Canyon"
        double averPrice = 0;
        double rating = 0;
        boolean gated = true;
        boolean allowPets = true;

        switch (name){
            case "Hills": 		System.out.println ("The neighborhood name is " + name);
                averPrice = 89000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;

            case "Oaks": 		System.out.println ("The neighborhood name is " + name);
                averPrice = 75000;
                rating = 3.5;
                gated = false;
                allowPets = true;
                break;

            case "Highland": 	System.out.println ("The neighborhood name is " + name);
                averPrice = 150000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;

            case "Canyon":    	System.out.println ("The neighborhood name is " + name);
                averPrice = 201000;
                rating = 4.8;
                gated = true;
                allowPets = true;
                break;
        }
        System.out.println ("Average price in the area is $" + averPrice + ".\nThe rating is " + rating + " out of 5.\n" + "Gated community? → " + gated  + "\nPets allowed? →  " + allowPets);

    }
}
