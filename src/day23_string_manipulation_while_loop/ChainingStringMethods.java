package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main (String []args){

        String word = "wooden spoon";
                // make upper case, then lower case, then count characters in String
        System.out.println(word.toUpperCase().toLowerCase().length());

        word = "woo den sp oon";
                // remove spaces and make everything upper case
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "chicago";
                // change first letter to upper case
        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1));
                         // read 1st character and make it upper     // read characters from 2nd letter and make them lower case

        city = "ISTANBUL";
                // type first letter capital, the rest small letters
        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase());
                    // read 1st character and make it upper     // read characters from 2nd letter and make them lower case

        String mountain = "KaBUl";
        System.out.println(mountain.substring(0, 1).toUpperCase() + mountain.substring(1).toLowerCase());
                       // read 1st character and make it upper     // read characters from 2nd letter and make them lower case

    }
}
