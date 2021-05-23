package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        /*
        print al leven nums between 1-100
        print all od nums between 1-100
       */
        System.out.println("EVEN NUMBERS");
        for (int  n = 0; n <= 100; n++) {         // start with 0 until 100 and add 1 every time
            if (n % 2 == 0) {                    // if statement inside loop
                System.out.print(n + " ");
            }
        }

        System.out.println("ODD NUMBERS");
        for (int k = 0; k <= 100; k++) {
            if (k %2 >0){
                System.out.print(k + " ");
            }
        }

    }
}
