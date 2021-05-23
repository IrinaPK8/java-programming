package day25_loops;
public class FizzBuzz {
    public static void main(String[] args) {
        /*
        when num is divisible by 3 and 5 --> FizzBuzz
        when only byu 3 --> Fizz
        when only by 5 --> Buzz
        when all are false --> print the number itself
         */
        for (int i = 0; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
        }
    }
