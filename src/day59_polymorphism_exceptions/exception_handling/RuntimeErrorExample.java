package day59_polymorphism_exceptions.exception_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        System.out.println(10 / 2);
       // System.out.println(10 / 0);
                // RuntimeException happens <-- error happening when code is running, throws ArithmeticException
        System.out.println(10 / 3);

        int [] nums = {4, 6, 10};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        // System.out.println(nums[3]);  // RuntimeException <-- ArrayIndexOutOfBoundsException

    }

}
