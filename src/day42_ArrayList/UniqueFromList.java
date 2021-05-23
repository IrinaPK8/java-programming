package day42_ArrayList;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {

        List<Integer> uniqueList = getUniqueNumber();
        System.out.println("\nunique lst = " + uniqueList);  //unique lst = [2, 1, 5, 0]
    }

    public static List<Integer> getUniqueNumber() {
        List <Integer> nums = new ArrayList<> (Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));

        // which numbers are unique in this list
        List <Integer> uniqueList = new ArrayList<>();
        //loop through list
        for (int each : nums){
            if (Collections.frequency(nums, each) == 1){
                System.out.print(each + " ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
