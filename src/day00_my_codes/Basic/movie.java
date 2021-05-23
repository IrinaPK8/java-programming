package day00_my_codes.Basic;

public class movie {
    public static void main (String [] args){
        String movieName = "Frozen";
        String genre = "animated cartoon";
        double duration = 1.42;
        String releaseYear = "27th of November 2013";
        char rating = 80;
        char rating2 = 71;
        boolean sequel = true;
        double imdb = 7.4;
        byte rottenTomatoes = 90;
        boolean isOnDvd = true;



        System.out.println ("--------WELCOME TO THE CINEMA--------");
        System.out.println("-------------------------------------");
        System.out.println ("Tonight we are streaming " + movieName + " which was released on " + releaseYear + ".\nThis movie has " + rating + rating2 + " rating.\nThis " + genre + " got a " + rottenTomatoes + "% rating on RottenTomatoes and " + imdb + " rating on IMDb.\nIt runs for " + duration + " hours.\nThis is a sequel " + sequel + " and is on DVD " +isOnDvd + ".");



    }
}
