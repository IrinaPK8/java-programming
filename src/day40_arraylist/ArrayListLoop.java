package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();  // polymorphic way to declare Array List
        System.out.println(nums);               // []
        System.out.println("size = " + nums.size());        // 0
        nums.add(34); nums.add(44); nums.add(3); nums.add(88); nums.add(500);
        nums.add(5); nums.add(845); nums.add(0);

        System.out.println(nums);          // [34, 44, 3, 88, 500, 5, 845, 0] --> print all added nums
        nums.remove(0);
        System.out.println(nums);           // [44, 3, 88, 500, 5, 845, 0] --> REMOVE BY INDEX

        nums.remove(new Integer(88));       // --> REMOVE BY VALUE - box it (wrapper class) first --> java will know it is number 88
        System.out.println(nums);           //  [44, 3, 500, 5, 845, 0]

        nums.remove(new Integer(5));
        System.out.println(nums);           // [44, 3, 500, 845, 0]

        // USE FOR LOOP to print one by one
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // USE FOR EACH LOOP to print one by one
        for (int each : nums){                  // or can use Integer each, int unboxes it automatically
            System.out.print(each + " ");
        }
    }
}
