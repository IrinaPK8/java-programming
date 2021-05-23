package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        /**read each character using for loop and charAt(i)
         * test if it matches letter
         *  if true/matches --> increase count by 1
         *  outside: print the count
         */

        String word = "java";
        char letter = 'a'; // check how many 'a'/ 'j' or whatever letters is in word java
        int count = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){          // if next is letter is the one we need to count, add one to count
                count++;
            }
        }
        System.out.println(count + " letters");
    }
}
