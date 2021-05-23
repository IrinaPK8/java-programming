package day29_nested_loops_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // #1 WAY TO DECLARE ARRAY - WHEN WE KNOW THE COUNT OF ITEMS BUT DO NOT KNOW VALUES YET

        int [] nums = new int [3];         // array variable, [3] - amount of items/size I want to store
                                            // SAME int nums [] = new int [3];
        nums [0] = 5;                    // at 0 index (index starts from 0) what value (5) would you like to store - "index 1 is 7" ...
                                         // assigning values to array
        nums [1] = 7;
        nums [2] = 10;

                                // printing values of array * NOT LIKE THAT XXXX System.out.println(nums); -->  [I@1b6d3586   XXXX
        System.out.println(nums[0]);        // printing value at index 0
        System.out.println("Value at index 0 = " + nums[0]);
        System.out.println("Value at index 1 = " + nums[1]);
        System.out.println("Value at index 2 = " + nums[2]);
            // nums [3] = 100;          // ArrayIndexOutOfBoundsException - because we store only [3] variables in and this is fourth

        int i = 0;
        System.out.println(nums[i]);    // we can use int variable to specify index number
                                        // i = 0, [0] = 5
        i++;
        System.out.println(nums[i]);        // 7 because i++ is 0 + 1 = 2, [2] = 7
        i++;
        System.out.println(nums[i]);

        //  HOW TO FIND OUT SIZE OF ARRAY
        System.out.println(nums.length);       // size/length is 3, however indexes are 0, 1 and 2 !! NOT length() ! no ()

        //STORE LENGTH OR ARRAY INTO LENGTH VARIABLE
        int length = nums.length;

        //CHANGE VALUES IN ARRAY
        nums [0] = 100;
        nums [1] = 300;;
        nums [2] = nums[1];

        System.out.println(nums [0]);
        System.out.println(nums [1]);
        System.out.println(nums [2]);

        // DECLARE AND ASSIGN VALUE IN SAME STATEMENT - GOOD TO USE WHEN WE HAVE DATA
        int [] numbers = {234, 12, 343, 545, 234, 222, 99}; // size of array is 7 and assigned values in same statement
        System.out.println(numbers.length);        // --> 7
        System.out.println(numbers [0]);               // 234

        double [] prices = new double [] {10.3, 44.0, 23.99};


    }
}
