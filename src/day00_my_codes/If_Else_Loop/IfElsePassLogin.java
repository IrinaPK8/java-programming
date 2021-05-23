package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class IfElsePassLogin {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter username and password: ");
        String userName = input.next();
        String password = input.next();
        String validUserName = "superuser";
        String validPass = "abc123";

        if(userName.equals (validUserName) && password.equals (validPass)) {
            System.out.println ("Access granted. Welcome agent!");
        }else {
            System.out.println ("Access denied");
        }

    }
}
