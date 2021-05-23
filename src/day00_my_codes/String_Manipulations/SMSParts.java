package day00_my_codes.String_Manipulations;

public class SMSParts {
    public static void main(String[] args) {
        /** [SMS parts]
         Given a String in the following format:
         “Sender: <James Bond>. From Number: [202-123-3456]. Message: {“I love programming and problem solving}”
         Separate these parts and print them separately:
         Sender: actualSender” “
         Number: actualNumber” “
         Message: actualMessage” */

        String message = "Sender: <James Bond>. From Number: [202-123-3456]. Message: {I love programming and problem solving}";
        String actualSender = message.substring(message.indexOf("<") +1, message.indexOf(">"));
        String actualNumber = message.substring(message.indexOf("[") +1, message.indexOf("]"));
        String actualMessage = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println ("Sender: " + actualSender);
        System.out.println ("Number: " + actualNumber);
        System.out.println ("Message: " + actualMessage);

    }
}
