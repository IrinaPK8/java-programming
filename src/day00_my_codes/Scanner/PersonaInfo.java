package day00_my_codes.Scanner;
import java.util.*;
public class PersonaInfo {
    public static void main(String[] args) {
        /** [Personal Information - Scanner and If]
         Ask the user how many people they live with?
         if user lives with Less than 2 people: print "Live with less than 2 people"
         if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
         if the user lives with more than 6 people: print "Live with "more than 6 people"
         Ask the user what city they live in?
         Ask the user if the live in downtown ("yes or no")
         if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
         if they have thought about it print "do it its great", if they have not print "You should think about it"
         Ask the user their favorite animal?
         Print "Wow %animal is a great animal" Ask the user how many pets they want?
         Print "Interesting, do you want %numberOfPets %favoriteAnimals?" */

        int amountOfPeople = 0;
        String city = "";
        boolean downtown = true;
        boolean moveToSuburbs = true;
        String favAnimal = "";
        int amountAnimals = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        amountOfPeople = scan.nextInt();
        if (amountOfPeople <= 2){
            System.out.println("Live with less than 2 people");
        }else if (amountOfPeople >=3 && amountOfPeople <= 6){
            System.out.println("Live with 3 - 6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city do you live in?");
        city = scan.next();
        System.out.println("Do you live in downtown? true/false ");
        downtown = scan.nextBoolean();
        if (downtown == true){
            System.out.println("Have you thought about moving to the suburbs? true/false ");
            moveToSuburbs = scan.nextBoolean();
            if (moveToSuburbs == true){
                System.out.println("Do it, it’s great!");
            }else {
                System.out.println("You should think about it");
            }
        }
        System.out.println("Who is your favourite animal?");
        favAnimal = scan.next();
        System.out.println("Wow! " + favAnimal + " is a great animal!");
        System.out.println("How many pets do you want?");
        amountAnimals = scan.nextInt();
        if (amountAnimals > 0){
            System.out.println("Interesting, do you want " + amountAnimals + " " + favAnimal + "?");
        }
    }
}
