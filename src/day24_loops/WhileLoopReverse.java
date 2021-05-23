package day24_loops;
public class WhileLoopReverse {
    public static void main(String[] args) {

        /* in loop we need to update variable so the condition becomes false.
        lets print:
        count = 5
        count = 4
        count = 3
        count = 2
        count = 1
        count = 0
        "Finished the count"
         */
        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count);
            count--;           // decrease by 1 until it reaches 5 in this case
            // all conditions have to be inside {} the loop body!!!!
        }
        System.out.println("Finished the count!");

        System.out.println("======================");

             /*
        read each message one by one until you have 0 unread sms
         */
        int unreadSMS = 5;
        System.out.println("I have total " + unreadSMS + " unread sms \uD83D\uDC8C");
                                                                // unicode for envelope emoji
        while (unreadSMS > 0) {        // while unread sms more than 0 --> keep on reading messages
            System.out.println("Read sms: " + unreadSMS);
            unreadSMS--;
        }
        System.out.println("You have no more unread sms messages!");
    }
}