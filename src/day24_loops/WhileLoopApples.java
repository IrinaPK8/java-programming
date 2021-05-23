package day24_loops;

public class WhileLoopApples {
    public static void main(String[] args) {

        int apples = 1;
        while (apples <= 10) {         // boolean condition
                /* while it is true(while number is less or equal to 10),
                 the code will be running body of loop again and again
                 (the next two lines) until condition reaches > 10
                 */
            System.out.println("Eat an apple");
            apples ++;          /* if this condition is not present, the loop
                                will be constantly running, because apples <=10
                                will always be true - INFINITE LOOP*/
        }
        System.out.println("No more apples :(");
                // code will exit loop once apples > 10 and prints this
    }
}
