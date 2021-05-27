package day29_nested_loops_arrays;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int minutes = 1; minutes <=5; minutes ++){
            System.out.println("\nminutes = "+ minutes);   // every time loop runs, this is getting printed
            for (int seconds = 1; seconds <= 60; seconds ++){
                System.out.print(seconds + " ");
            }
        }
        /** should print like this:
         * 0:1
         * 0:2
         * 0:3
         * ....
         * 0:59
         * 1:0
         * 1:2
         * .....
         */
        for (int minutes = 0; minutes <=4; minutes ++){
            for (int seconds = 0; seconds <60; seconds ++){
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}