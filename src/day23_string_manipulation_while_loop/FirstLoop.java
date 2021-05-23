package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {

        int i = 1;

        /** if(i <= 5){                 // if statement will run top to bottom and check condition once, then print value of i
            System.out.println(i);
            i++;                    // if we change i here, it will not go to if and check it again
        } */

       while (i <= 5){               // WHILE LOOP will run and check condition multiple times
            System.out.println(i);
            i++;                    /** if we change it now, it will go back to while loop and check it again
                                    // until i is not <= 5 and then it will stop checking
           // 1+1 = 2 <= 5 going back to loop --> true, 2 is printed
            2 + 1 = 3 <= 5 going back to loop --> true, 3 is printed
            3 + 1 = 4 <= 5 going back to loop --> true, 4 is printed
            4 + 1 = 5 <= 5 going back to loop --> true, 5 is printed
            5 + 1 does not <= 5 going back to loop - STOP! NOT PRINTING ANYMORE
           */
        }

       int apples = 0;
        while (apples <= 3){
            System.out.println("apple --> " + apples);
            apples ++;
       }
        System.out.println("apples = " + apples);   // makes it 4 because after it printed 3,
                                                    // it went back to add ++ and check in loop again
                                                    // 4 is false condition, but it is already 4 --> 4 will be printed out

        // INFINITE LOOP
        while (true) {
            System.out.println("Hello world");
        }



    }
}
