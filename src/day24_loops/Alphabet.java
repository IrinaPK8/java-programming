package day24_loops;

public class Alphabet {
    public static void main(String[] args) throws InterruptedException {

        /* System.out.println(letter);     // a
        letter ++;
        System.out.println(letter);         // b  */

        char letter = 'a';      // will start printing from this letter forward because ++
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;                    // each ++ will go up alphabet one letter at a time
        }
        System.out.println("");

        // IN REVERSE ORDER //
       letter = 'z';            // will start printing from this letter backwards because of --
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;           // printing alphabet from z to a one by one, reverse order because of --
        }
    }
}
