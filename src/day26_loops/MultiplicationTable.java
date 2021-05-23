package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        /**number -> 2
         using a for loop, print multiplication table for the number
         2 x 1 = 2
         2 x 2 = 4
         ...
         2 x 10 = 20 */

        int number = 2;                     // multiplication table by two --> we will always multiply by 2
                                            // by changing number variable (to 3,5 ,6, 9 etc - any number)
                                            //--> we can create any multiplication table

        if (number < 1 || number > 10){
            System.out.println("Error, invalid input");
            return;                         // need to exit main method otherwise java will keep going and print table ven for invalid number
                                // because if anf for are two separate conditions - java will run one and then another. RETURN WILL STOP IT
        }

        for (int i = 1; i <=10; i++){       // number to multiply by --> i will start with 1 and will be adding one each loop to go up to 10
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
