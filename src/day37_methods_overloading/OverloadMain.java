package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello from Real Main Method");
        main(10);
    }

    /** overloading main method:
     * same name + different parameter
     * JDK does not look for this one to run
     * */

    public static void main (int num) {
        System.out.println("num = " + num);
    }

}
