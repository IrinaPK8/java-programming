package OfficeHour.Practice_03_02_2021;

public class PersonInfo {

    public static void main (String [] args){

        // DECLARING MULTIPLE VARIABLES - int = numberOfSeasonsInYourArea, year;

        char name1 = 73;
        char name2 = 114;
        char name3 = 105;
        char name4 = 110;
        char name5 = 97;
        byte age = 37;
        char gender = 70;
        boolean student = true;
        short numberOfSiblings = 1;
        long favoriteNumber = 8L;
        int numberOfSeasonsInYourArea = 4;
        double birthDate = 7.11;
        int year = 1983;
        String favoriteQuote = "not have favorite quote";

        System.out.println ("The name is " + name1+name2+name3+name4+name5);
        System.out.println ("The age is " + age);
        System.out.println ("The gender is " + gender);
        System.out.println ("Student? -->" + student);
        System.out.println ("Number of sibligs is " + numberOfSiblings);
        System.out.println ("Favorite number is " + favoriteNumber);
        System.out.println ("Number of seasons in a year is " + numberOfSeasonsInYourArea);
        System.out.println ("Full birthdate is "+birthDate+ "." +year);  // we cannot use '.' to print dot because according to ASCII . equals 46. then birth date (decimal) 7.11+46 equals 53.11 <-- this will be printed out!
        System.out.println ("Does " + favoriteQuote);
    }
}
