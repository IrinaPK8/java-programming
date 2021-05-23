package day26_loops;

public class WeekDays {
    public static void main(String[] args) {

        /**
         * loop n = 1 - 10
         * use switch inside loop
         * when n is 1 --> "1 - Monday", n is 2 ->> "2 - Tuesday" ...
         */

        for (int n = 1; n <= 10; n++){
            switch (n){
                case 1:
                    System.out.println(n + " - Monday");
                    break;                  // when we exit case 1 switch, we will still be in the loop, so loop will go on running
                case 2:
                    System.out.println(n + " - Tuesday");
                    break;
                case 3:
                    System.out.println(n + " - Wednesday");
                    break;
                case 4:
                    System.out.println(n + " - Thursday");
                    break;
                case 5:
                    System.out.println(n + " - Friday");
                    break;
                case 6:
                    System.out.println(n + " - Saturday");
                    break;
                case 7:
                    System.out.println(n + " - Sunday");
                    break;
                default:
                    System.out.println("No such day");
                    break;
            }
        }
                }

    }
