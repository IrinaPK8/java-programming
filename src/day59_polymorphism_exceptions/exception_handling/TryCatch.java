package day59_polymorphism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {

        try {                               // try this code
            System.out.println(10 / 2);
            System.out.println(10 / 0);     // does not run the rest of the code within {} after catches it
            System.out.println(10 / 3);
                                            // PROTECTED CODE --> code within try {}
        }catch (Exception e) {              // if anything goes wrong - catch it
            System.out.println("RuntimeException happened and handled");
        }
        System.out.println("After first try catch");


        int [] nums = {11, 33, 44};
        try {
            System.out.println(nums[0]);
            System.out.println(nums[3]);
            System.out.println(nums[1]);    // will not print code after error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled");
        }
        System.out.println("After array code");
    }
}
