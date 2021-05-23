package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'g';
        int index = - 1;        // - 1 because I'm thinking letter I'm looking for is not there --> negative assumption
                                // we store in index because we want to use it outside the loop too
        for (int n = 0; n < word.length(); n++) {
            /**  */
                        // System.out.println(n + " - " + word.charAt(n));    // charAt because we give charAt number and it gives letter back
            if (word.charAt(n) == letter){
                index = n;                  // when it is matching, store index here
                System.out.println(letter + " is found at index " + index);
                break;         // need to end loop once condition is found --> exit loop BUT there might be other conditions outside the loop
                                // for more/ other same letters to be found - remove the break!!!
                                // RETURN; --> stops the entire code, not just exits the loop
            }
        }

        if (index == -1) {
            System.out.println(letter + "is not present");
        }


    }
}
