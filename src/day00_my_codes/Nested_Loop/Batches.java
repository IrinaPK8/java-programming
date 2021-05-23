package day00_my_codes.Nested_Loop;

public class Batches {
    public static void main(String[] args) {

        //> morning - print: Class times are 10-5 EST. M, T, Th, F.
        //                     > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
        //                  - for EU batches:
        //                 > print: Class times are  10-5 EST. M, T, W, Th, F.

        String batch = "EU";        // US
        String time = "evening";    // morning, evening
        if (batch.equals("EU")) {
            System.out.println("Class times are 10 - 5 EST.M, T, W, Th, F");
        } else if (batch.equals("US")) {
            if (time.equals("morning")) {
                System.out.println("Morning class times are 10 - 5 EST.M, T, Th, F");
            } else if (time.equals("evening")) {
                System.out.println("Evening class times are 7 - 10 EST.M, T, W, Th, S, S");
            }
        }else {
            System.out.println("Invalid entry");
        }
    }
}
