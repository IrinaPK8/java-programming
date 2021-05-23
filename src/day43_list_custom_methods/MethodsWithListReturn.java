package day43_list_custom_methods;
import java.util.ArrayList;
import java.util.List;
public class MethodsWithListReturn {
    public static void main(String[] args) {

        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList();
            // when calling method, we can store it directly to variable
                    // System.out.println(mlnNums); --> to print result
        long end = System.nanoTime();
        System.out.println("ArrayList time in nanoseconds = " + (end - start));// how many nano seconds took for array list
        double listSeconds = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time in seconds = " + listSeconds);

        long st = System.nanoTime();
        int [] arr = getIntegerArray();
        long ed = System.nanoTime();
        System.out.println("Array time in nanoseconds = " + (ed - st));
        double seconds = (ed - st) / 1_000_000_000.0; // calculate how many seconds
        System.out.println("Array time in seconds = " + seconds);
   }

    public static List<Integer> getIntegerList () {
        /** getIntegerList
         * No params
         * return List<Integer>
         * Loop from 0 - 1000_000
         * and add to arraylist then return it  */

        ArrayList <Integer> nums = new ArrayList <>();
        for (int i = 0; i <= 1000_000; i++){
            nums.add(i);
        }
        return nums;
    }

    public static int [] getIntegerArray () {
        /** getIntegerArrayList
         * No params
         * return int []
         * Loop from 0 - 1000_000
         * and add to arraylist then return it  */
            // declare  empty array with size  1000_000
        int [] nums = new int[1000_001];
            // loop and assign numbers
        for (int i = 0; i<= 1000_000; i++){
            nums [i] = i;           // assigning values
        }
        return nums;    // return
    }
}
