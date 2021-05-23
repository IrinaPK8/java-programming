package day41_arraylist;
import java.util.*;
public class CitiesList {
    public static void main(String[] args) {
            // declare array list
        ArrayList<String> cities = new ArrayList<>();
            // add value to array list --> add methods
        cities.add("Washington");       // index 0 in array list
        cities.add("New York");         // index 1 in array list
        cities.add("Vienna");          // index 2 in array list
        cities.add("Adana");           // index 3 in array list
        cities.add("LA");               // index 4 in array list
        cities.add(0, "Ashgabat");      //means we added this city to the beginning--> index 0
            // print all values in same line
        System.out.println(cities);
            // print first and last city from array list
        System.out.println("first city " + cities.get(0));
        System.out.println("last city " + cities.get(cities.size() - 1));
            // print count of items in array list / the size
        System.out.println("count of cities " + cities.size());
            // store count into variable
        int size = cities.size();
        System.out.println(("size " + size));
            // use for loop and print values in same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
            // use for each loop and print values in same line
        for (String each : cities) {
            System.out.print(each + " ");
        }
        System.out.println();
            // see it array list contains LA
        System.out.println("is there LA is list? --> " + cities.contains("LA"));
            // remove / delete item from array list
            // remove using index --> delete value at index (...)
        cities.remove(3);
            //remove using object / value --> delete certain word in string
        cities.remove("New York");
        System.out.println("after removal " + cities);
            // remove everything
        cities.clear();
        System.out.println("all values removed " + cities);
            // to confirm it is clear
        System.out.println("is list empty? --> " + cities.isEmpty());
            // check if size if size is 0
        if (cities.size() ==0){
            System.out.println("list is empty");
        }
    }
}
