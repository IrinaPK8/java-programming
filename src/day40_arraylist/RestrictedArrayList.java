package day40_arraylist;

import java.util.*;

public class RestrictedArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println(nums);                       // print all values in same line
        System.out.println(nums.size());                 // print size of ArrayList
        System.out.println("index 0 =" + nums.get(0));   // print character index 0
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 1 = " + nums.get(2));
        nums.remove(1);                 // removes 7
        System.out.println(nums);       // [5, 11]


    }
}
