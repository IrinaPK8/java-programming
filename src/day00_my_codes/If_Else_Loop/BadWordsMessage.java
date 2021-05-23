package day00_my_codes.If_Else_Loop;

public class BadWordsMessage {
    public static void main(String[] args) {
        /** Given a String variable with a message. You will check if the message
         contains any of these bad words: “idiot, dumb, heck”
         -> If the message contains any of those words print: “Message not sent”.
         -> If the message is bad word free print “Message sent” */

        String message = "Today is a good day!";
        if (message.contains("idiot")|| message.contains("dumb") || message.contains("heck")){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }

    }
}
