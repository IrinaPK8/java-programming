package day43_list_custom_methods;
import java.util.*;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
            // can return like above or store in variable and the System.out.println it
        List<String> dayNames = getDays();
        System.out.println("Day names = " + dayNames);

        System.out.println("getDays().size()  = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        dayNames.add("java day");

        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("day names after removal = " + dayNames);

        System.out.println(getRandomList(10));
                            // 10 indicates how many random numbers to print
        List<Integer> nums = getRandomList(100);  // storing and giving new limit 100
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
                // remove all nums that are less than 100
        nums.removeIf(n -> n < 90);
        System.out.println("nums > 90 " + nums);
        }

    public static List<String> getDays () {
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");

       // OR CAN ASSIGN VALUE LIKE THIS
        // List<String> days = new ArrayList<>(Arrays.asList
          // ("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));

        return days;
    }

    public static List <Integer> getRandomList (int size){
        /**
         getRandomList
         param: int size
         return List<Integer>
         generate random numbers(0-100) the count of size, and assign to List then return
         getRandomList(3) -> 43, 12, 54
         getRandomList(2) -> 1, 4
         */

        Random random = new Random ();      // to generate random numbers
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++){            // to loop through random
            nums.add(random.nextInt(101));          // adding random numbers to array list right away
                            // 101 defines boundaries to 100 limit
        }

        return nums;
    }
}
