package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {

        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45, 23, 54, 23, 45, 3, 35, 4, 6, 556, 3, 45, 6, 23, 35, 456, 3, 45, 36, 34, 2, 45, 6, 7, 34, 234, 54 ,5);
    }
    public static void addNumbers (int... nums) { // varargs is treated as array
        // ... means no linit - we can add as many numbers as we want
        // you cannot have more than one varargs (int ... nums, int ... nums2) <-- NO
        // cannot add String to varargs
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
