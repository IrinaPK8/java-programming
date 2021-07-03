package day59_polymorphism_exceptions.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {

        try {
            System.out.println("hello");
            System.out.println(5 /0);       // RuntimeException
        } catch (Exception ignore) {
        }
        System.out.println("How are you today?");
        System.out.println("We just suppressed/swallowed Runtime Exception");
        System.out.println("Error is not reported, we just ignored it");
    }
}
