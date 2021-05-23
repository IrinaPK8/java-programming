package day42_ArrayList;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List <Character> letters = new ArrayList<>();
            // another way to declare values
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size is " + letters.size() + " letters");
        System.out.println(letters);  // printed array list [j, a, v, a, i, s, f, u, n]
            // reverse array list, letters in array list
        Collections.reverse(letters);
        System.out.println("reversed letters " + letters);      // [n, u, f, s, i, a, v, a, j]
        Collections.reverse(letters);
        System.out.println(letters);
            // to find out how many items of same time in array list
        System.out.println(Collections.frequency(letters, 'a'));        // 2
            // let's store the result
        int vCount = Collections.frequency(letters, 'v');
        System.out.println(vCount);                 // 1
            // getting the highest character according to ASCII value
        System.out.println("Max char = " + Collections.max(letters));       // v
            // getting min char according to ASCII value
        System.out.println(Collections.min(letters));                   // a
            // replace all values in array list --> (list name, what to replace, with what to replace)
        Collections.replaceAll(letters, 'a', 'o');
        System.out.println(letters);            // [n, u, f, s, i, o, v, o, j]
        Collections.replaceAll(letters, 'o', 'a');
        System.out.println(letters);
            // sorting alphabetically
        Collections.sort(letters);
        System.out.println(letters);

        System.out.println();

        List <Integer> nums = Arrays.asList(23, 5,  1, 234, 5, 7, -9, 1, 5, 0, 5);
        System.out.println("numbers = " + nums);
        Collections.reverse(nums);
        System.out.println("reversed = " + nums);
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("count of fives = " + countOfFives);

        Collections.replaceAll(nums, 5, 50);
        System.out.println(nums);
            // to sort in reverse order
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort " + nums);

            // shuffle items in array list
        Collections.shuffle(nums);
        System.out.println("after shuffle = " + nums);

    }
}
