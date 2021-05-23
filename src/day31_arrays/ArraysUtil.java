package day31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {

        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));     // just printing all nums in same line -  [100, 5, 1, 7, 0, -4, 44, 33]

        Arrays.sort(nums); // sort nums - change array values, rearrange values
        System.out.println(Arrays.toString(nums));  // now print out sorted nums (need to convert toString !!!)

        System.out.println("min value " + nums[0]);  // printing out -4 - minimum value
        System.out.println("max value " + nums [nums.length - 1]);  // 100 - printing max value

        String [] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"} ;
        // ways to print out
        System.out.println(Arrays.toString(words));   // [java, C#, C++, Kotlin, Python, Ruby, Assembly]
        System.out.println(String.join(", ", words));  // java, C#, C++, Kotlin, Python, Ruby, Assembly

        // sort alphabetically
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));   // [C#, C++, Java, Kotlin, Python, Ruby, assembly]
                                    // assembly is at the end because in ASCII table lower case letters come after uppercase

        //sort in reverse order

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));     // [assembly, Ruby, Python, Kotlin, Java, C++, C#]
    }
}
