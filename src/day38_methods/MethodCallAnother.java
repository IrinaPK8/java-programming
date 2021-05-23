package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        end();
    }

    public static void start (){  // method start called in main method
        System.out.println("start");  // it prints start first
        continues();                // then go to method continue
    }

    public static void continues () {
        System.out.println("continue"); // it prints continues
        end();                      // then goes to method end
    }

    public static void end () {
        System.out.println("end"); // it prints end
                    /**if we can start method here, first it will work and then
                    it will show stack overflow (meaning java memory is full) then */
    }
}
