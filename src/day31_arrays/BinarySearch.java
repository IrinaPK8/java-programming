package day31_arrays;

import java.util.*;  // OR import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

           // indexes  0    1    2    3      4      5
        int [] nums = {23, 123, 654, 2344, 12345, 14421};

        System.out.println(Arrays.binarySearch(nums, 23));     // nums --> where you are looking, 23 --> what you are looking for
                                                               // returns index value
        System.out.println(Arrays.binarySearch(nums, 2344));   // 3
        System.out.println(Arrays.binarySearch(nums, 25));     // 2 - java will assume that if 25 was in Array, it would be in the place 1, then adds 1 = 2 and then makes it negative -2
        System.out.println(Arrays.binarySearch(nums, 700));    // -4
        System.out.println(Arrays.binarySearch(nums, -5));     // -1 - doe not work with negatives

                // check if number 12345 is among numbers in array
        if (Arrays.binarySearch(nums, 12345) >= 0){   // 0 indicates index here
            System.out.println("12345 is present in the Array");
        }else {
            System.out.println("12345 is not present");
        }
        }
    }
