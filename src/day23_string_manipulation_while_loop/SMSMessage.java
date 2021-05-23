package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {

        String message = "Sender: [Nadir] From number <202-375-1774> Message {Hello, let's code some java}" ;

        int start = message.indexOf("[");                       // index find the number position of [
        int end = message.indexOf("]");                         // index find the number position of ]
        message.substring(start + 1, end);                      // we need two numbers for substring to read word between these numbers
                                                                // start +1 because we do not need to read bracket itself but the letter after it
        System.out.println(message.substring(start + 1, end));  // Nadir
        String sender = message.substring(start + 1, end);      // storing it into a variable!!!
        System.out.println("sender = " + sender);               // printing out with variable
        
        String mobile = message.substring(message.indexOf("<") + 1, message.indexOf(">")); // same steps what we did above but in one line, shorter
        System.out.println("mobile = " + mobile);
        
        String sms = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println("sms = " + sms);

        // THIS ABOVE MAKES CODE DYNAMIC - WE CAN CHANGE NAME, PH1ONE, MESSAGE ITSELF AND CODE WILL BE PRINTING IT OUT RIGHT !!!!!

        System.out.println(" Saim ".trim());        // trim removes empty spaces on sides BUT NOT THE MIDDLE ONE if there is one there
        System.out.println(" \n\t Saim \t\n".trim());      // trim will also remove \n and \t

        sender = sender.trim();
        if (sender.equals("Saim")){
            System.out.println("Message from Saim");
        }else{
            System.out.println("Someone else's message");
        }

        String text = " java ";
        System.out.println(text.trim());



    }
}
