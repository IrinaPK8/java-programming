package day33_arrays;

import java.util.*;

public class ReverseArrayOne {
    public static void main(String[] args) {
        /** String [] words = {"java", "python", "ruby", "sql"};
         PRINT THESE WORDS IN REVERSE
         for (int i = words.length - 1; i  >= 0; i--){
         System.out.println(words[i]);
         } */
                // LOOP WITH 2 VARIABLES
        int[] nums = {5, 10, 4, 100};
        int[] numsRev = new int[nums.length];     // {0, 0, 0, 0} - all values are 0 by default now
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
                // need to assign it to numsRev but it needs to be in the correct indexes
                // j = 0; j++ will be going 0, 1, 2, 3 assigning it to correct indexes
            numsRev[j] = nums[i];
                // go numsRev at position j (which is 0) and assign value at position of i (will go 3, 2, 1, 0)
        }
        System.out.println(Arrays.toString(nums));  // need arrays to string to print out all in same line
        System.out.println(Arrays.toString(numsRev));
    }
}
