package day41_arraylist;
import java.util.*;
public class DrinksWithCaffeine {
    public static void main(String[] args) {
        /**
         List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celcius
         int caffeineAmount = 0;

         monster, red bull, celcius --> have same amount about 150
         coffee, kombucha --> 112
         tea, coke, pepsi, mdew --> 35
         */
        List<String> drinksWithCaffeine = new ArrayList(Arrays.asList("coffee", "tea",
                "monster", "red bull", "coke", "pepsi",
                "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount;
        for (String drink : drinksWithCaffeine){
            // can do if statement or switch
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            }else if (drink.equals("coffee") || drink.equals("kambucha")){
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);
            }else if ((drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew"))){
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }
        System.out.println();

        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
            }
            System.out.println();
        }
        // FOR ARRAY LISTS LOOP -->
        // .forEach(... -> System.out.println(...);
        // PRINTS EACH VALUE IN SEPARATE LINE
        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
    }
}
