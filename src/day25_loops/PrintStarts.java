package day25_loops;
public class PrintStarts {
    public static void main(String[] args) {
        /* using for loop, print 15 stars in same line
                 * * * * * * * * * * * * * * *
         */

        for (int star = 1; star <= 15; star++){ /* if int star = 100
                                                --> nothing will be printed
                                                 ! when condition is wrong from the beginning,
                                                 it will be false immediately*/
            System.out.print("\uD83C\uDF1F ");          // unicode for star
        }
        System.out.println("");
        // fill 5 stars to myStars variable
        String myStars = "";
        for (int stars = 1; stars<=5; stars++){  // every time loop is running, we are adding one star "* "
           myStars += "* ";                      // container
        }
        System.out.println("my stars = " + myStars); //.trim(); - can use to remove beginning and end spaces
    }
}
