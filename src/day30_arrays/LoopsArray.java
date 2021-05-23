package day30_arrays;

public class LoopsArray {
    public static void main(String[] args) {

        int [] nums = {22, 55, 11};
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);        // output:   22 55 11
        }

        // FOR EACH LOOP WORKS ONLY WITH DATA COLLECTIONS

        int [] numbers = {33, 11, 66};
        for (int eachNum : numbers) {             // (declare temp variable same data type as in array : declare collection of array(its name))
            System.out.println(eachNum);
        }
    }
}
