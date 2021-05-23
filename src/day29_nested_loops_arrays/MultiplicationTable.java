package day29_nested_loops_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int outer = 1; outer <=10; outer ++){
            for (int inner = 1; inner <= 10; inner++){
                System.out.print(inner*outer + "\t"); // \t is needed to make table look even
            }
            System.out.println();
            // inside outer loop only to print inner loop in new line each time
        }
    }
}
