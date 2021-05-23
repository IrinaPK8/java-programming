package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        int seconds = 0;
        System.out.println("Let's watch Cat \uD83D\uDC08 video on YouTube!");
                                // UNICODE FOR CAT EMOJI - \uD83D\uDC08
        while (seconds <= 117) {
            System.out.println("Watching YouTube \uD83D\uDC08 video: second " + seconds);
                        /* print this, while we do not reach the last second */
            seconds ++; // adding by one second until it reaches 117
            Thread.sleep(1000);
            /* this will print message one second (1000 milliseconds = 1 second)
            at a time. 1000 --> can be any number
             */
        }
        System.out.println("Finished watching \uD83D\uDC08 video. Let's start another one!");
                    /* print this when video seconds are over */
    }
}
