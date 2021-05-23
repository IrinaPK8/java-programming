package day29_nested_loops_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int out = 1; out <= 5; out++) {    // repeat inner loop five times, i. e. print row of 10 stars 5 times

            for (int in = 1; in <= 10; in++) { // print 10 stars in a row
                System.out.print("* ");
            }
            System.out.println();  // we need this line to start each next set of 10 stars from new line (we used print without ln earlier
        }
        System.out.println("===================================");

        // NOW INNER WILL GO UNTIL THE OUTER GOES
        for (int outer = 1; outer <= 10; outer++) {                 // for rows -> amount of rows is determined by how many times outer loop will tun
            for (int inner = 1; inner <= outer; inner++) {          // for amount of stars in a row
                /** inner starts with one until outer value (1 at first) - > inner prints 1 star
                 * outer becomes 2 -> goes to inner - > inner becomes 2 (inner was 1 and adds 1 now) -> inner prints 2 stars
                 * outer becomes 3 -> goes to inner -> inner becomes 3 (inner was 2 and adds 1 more) -> inner prints 3 stars
                 * outer becomes 4 -> goes to inner -> inner becomes 4 (inner was 3 and adds 1 now) - > inner prints 4 stars
                 * outer becomes 5 - > goes to inner -> inner becomes 5 (inner was 4 and adds 1 now) - > inner prints 5 stars
                 * ........................... etc until outer reaches 10
                 * exits outer loop
                 */
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        // DO REVERSE NOW
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
