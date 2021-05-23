package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int counter = 1;
        do {
            System.out.println("counter = " + counter);
            counter ++;
        }while (counter <= 10);                         // infinite loop if counter ++; is not added
            System.out.println("");

        counter = 100;
        do {
            System.out.println("counter = " + counter); /* it will print counter = 100 --- as per do while
                                        loop --> action first, which is printing --> then will check condition,
                                        which is false so after that nothing will be done --> exit the loop */
            counter ++;
        }while (counter <= 10);
        System.out.println("");
        counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter += 100;                   // to print every 100th number
        }while (counter <= 1000);
    }
}
