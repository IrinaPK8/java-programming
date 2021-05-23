package day00_my_codes.If_Else_Loop;

public class CoolName {
    public static void main(String[] args) {
        /** [Cool Name]

         Declare a variable name. You will check if it is a cool name.
         - If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
         - If the name ends with 'm' print "Almost cool"
         - Otherwise print “Sorry not a cool name” */

        String name = "Maria";
        if (name.startsWith ("A") || name.startsWith ("Z")) {
            System.out.println ("Your name is cool");
        }else if (name.startsWith ("M")) {
            System.out.println ("Almost cool");
        }else {
            System.out.println ("Sorry not a cool name");
        }
    }
}
