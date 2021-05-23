package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        count 1 to 5 and calculate the sum
         */
        int sum = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum = " + sum);

    }
}