package day41_arraylist;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ArraysAsList {
    public static void main(String[] args) {
            // adding items to Array List via one statement
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println(nums);
            // nums.add (100); --> any manipulation will not work because .asList was used
            // unsupported manipulation
            // WORK AROUND
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
            // now we can use method manipulation
        numsList.add (33);
        numsList.add (56);
        System.out.println("numsList = " + numsList);
            // remove number at index 0
        numsList.remove(0);
            // remove number at index 0 --> use wrapper class
        numsList.remove(new Integer(23));
        System.out.println(numsList);

    }
}
