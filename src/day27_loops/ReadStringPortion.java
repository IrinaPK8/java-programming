package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        /** USUAL WAY:
        // using substring print first three letters

         String list = "cat,car,cat,red_car,java,selenium";

        System.out.println(list.substring(0, 3));       // cat
        System.out.println(list.substring(1, 4));        // at,
        System.out.println(list.substring(2, 5));       // t,c
        System.out.println(list.substring(3, 6));       //,ca
        System.out.println(list.substring(4, 7));       // car

        System.out.println("");

        int i = 0;
        System.out.println(list.substring(i, i+3));       // cat
        i++;                                                // i starts at 1, not at 0 now
        System.out.println(list.substring(i, i+3));     // at,
        i++;                                                // i starts at 1, not at 0 now
        System.out.println(list.substring(i, i+3));     // t,c
        i++;
        System.out.println(list.substring(i, i+3));     // ,ca
        i++;
        System.out.println(list.substring(i, i+3));     // car */

        // FOR LOOP

        String list = "cat,car,cat,red_car,java,selenium";
        for (int i = 0; i < list.length() - 2; i ++) {         // we do -2 because since we are printing 3 letters we need -2 not to have out of bounds error
            System.out.println(list.substring(i, i +3));       // start reading from i and finish in three letters (+ 3)

            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals ("car")){
                System.out.println("cat or car found");
            }
        }




    }
}
