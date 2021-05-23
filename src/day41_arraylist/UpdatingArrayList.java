package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();  //declare array list
            // adding cars to the list
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
            // adding this car to the beginning
        myCars.add(0, "Jeep");
            // adding this car to index 1
        myCars.add(1, "Lada");
            // adding this car to index 2
        myCars.add(2, "Yugo");
            // printing all cars to string
        System.out.println(myCars.toString());
            // saves all cars in one string variable
        String allCarsOneList = myCars.toString();
        System.out.println("all cars in one string = " + allCarsOneList);
            // changing one of the cars at index to smth else
        myCars.set(0, "Lamborghini");
        System.out.println(myCars.toString());
        myCars.set(1, "Honda");
        System.out.println(myCars.toString());
            // find index number of Ford
        myCars.indexOf("Ford");
        System.out.println("index of Ford is " + myCars.indexOf("Ford"));
            // storing into variable the index number
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("Moskvich index is " + moskvichIndex);
            // changing Moskvich to another car
        myCars.set(6, "Zhiguli");
        System.out.println(myCars);
            // replace Ford with Trabant
        myCars.set(myCars.indexOf("Ford"), "Trabant");
        System.out.println(myCars);
            // check if Yugo is there and change Yugo to Bugatti
        if (myCars.contains("Yugo")){
            myCars.set(myCars.indexOf ("Yugo"), "Bugatti");
        }else{
            System.out.println("Yugo is not found");
        }
        System.out.println("Yugo replaced to Bugatti --> " + myCars);
            // change Trabant to Prius, Zhiguli to Audi, Mazda to Maybach
        for (int i = 0; i < myCars.size(); i++){
                // loop allows us to look for all Trabants in the Array list
                // and replace all of them, not just the first sound
            if(myCars.get(i).equals ("Trabant")){
                myCars.set(i, "Prius");
            }else if (myCars.get(i).equals("Zhiguli")){
                myCars.set(i, "Audi");
            }else if (myCars.get(i).equals("Mazda")){
                myCars.set(i, "Maybach");
            }
        }
        System.out.println("After looping --> " + myCars);
    }
}
