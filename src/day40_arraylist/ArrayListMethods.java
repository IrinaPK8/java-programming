package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List <String> shoppingList = new ArrayList <>();
        System.out.println("size = " + shoppingList.size());            // 0
        System.out.println("isEmpty? = " + shoppingList.isEmpty());         // true
        if (shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }

        shoppingList.add("Shoes");
        shoppingList.add("Cheap monitor");
        shoppingList.add("Mask");
        shoppingList.add("Wooden spoon");
        shoppingList.add("Scooter");
        shoppingList.add("java book");
        shoppingList.add("Tesla");
        System.out.println("isEmpty now? = " +shoppingList.isEmpty());

        int count = shoppingList.size();
        System.out.println("How many items on the list? " + count);

        System.out.println("Is shoes in my list? " + shoppingList.contains("Shoes"));

        if (shoppingList.contains("Shoes")) {
            System.out.println("Got shoes!");
        }
        shoppingList.remove("Shoes");
        System.out.println(shoppingList);     // [Cheap monitor, Mask, Wooden spoon, Scooter, java book, Tesla]
        System.out.println("Done shopping");
        shoppingList.clear();
        System.out.println(shoppingList);


    }
}
