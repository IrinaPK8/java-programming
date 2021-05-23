package day33_arrays;
import java.util.*;

public class ReverseArrayTwo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        // swap without additional variable

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        int [] nums = {5, 10, 4, 100};
        System.out.println("Before swap " + Arrays.toString(nums));
        temp = nums[0];
        nums[0] = nums [3];
        nums[3] = temp;
        System.out.println("After 1st and last swap " + Arrays.toString(nums));
        System.out.println();

        int []nums2 = {5, 10, 4, 100};
        System.out.println("Before " + Arrays.toString(nums2));
        for (int i = 0; i < nums2.length/2; i++){  // /2 means looping through halfway
            int temp2 = nums[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2 [nums2.length -1 - i] = temp2;
        }
        System.out.println("After " + Arrays.toString(nums2));
        System.out.println();

        String [] words = {"java", "html", "js", "ruby", "css"};
        // reverse words without additional array
        System.out.println("Before reverse " + Arrays.toString(words));
        for (int i = 0, j = words.length - 1; i < words.length/2; i++, j--){
            // i = 0, j = 4                   // i = 2
            String tempWords = words [i];   // string to store variable
            words [i] = words[j];
            words[j] = tempWords;
        }
        System.out.println("After reverse " + Arrays.toString(words));
    }
}
