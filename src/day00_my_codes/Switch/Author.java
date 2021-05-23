package day00_my_codes.Switch;

public class Author {
    public static void main(String[] args) {
        /* You are an author. You are writing a book and want to figure out some information related to the genre
        of book you are writing. Given the genre name figure out: average page length, average profit,
        average number of sequels, average number of countries published in.
        Make variables for all of that information. Given empty defaults for all except the genre name.
        Print the information once at the end
            Data based on genre:
        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40*/

        String genre = "Short Story";
        int averPageLength = 0;
        int averProfit = 0;
        int averNumSequels = 0;
        int averNumCountriesPublished = 0;

        switch (genre) {
            case "Fantasy":			System.out.println("The genre of the book is " + genre);
                averPageLength = 500;
                averProfit = 1_000_000;
                averNumSequels = 5;
                averNumCountriesPublished = 50;
                break;

            case "Detective": 		 System.out.println("The genre of the book is " + genre);
                averPageLength = 350;
                averProfit = 700_000;
                averNumSequels = 3;
                averNumCountriesPublished = 45;
                break;

            case "Science Fiction":      System.out.println("The genre of the book is " + genre);
                averPageLength = 720;
                averProfit = 900_500;
                averNumSequels = 4;
                averNumCountriesPublished = 30;
                break;

            case "Short Story":         System.out.println("The genre of the book is " + genre);
                averPageLength = 150;
                averProfit = 300_000;
                averNumSequels = 1;
                averNumCountriesPublished = 40;
        }
        System.out.println ("Average page length is " + averPageLength + ".\nAverage profit of this genre is " + averProfit + ".\nAverage number of sequels is " + averNumSequels + ".\nAverage number of country it was published in is " + averNumCountriesPublished);

    }
}
