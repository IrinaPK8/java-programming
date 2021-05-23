package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class BooleanValue {
    public static void main (String [] args){

       /* Write a program that will accept a boolean value.
       Print out the opposite of the given boolean
        Ex: true -> false
        false -> true       */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter boolean value: ");
        boolean value = scan.nextBoolean();
        if(value != true){
            System.out.println ("true --> " + value);
        }else{
            System.out.println ("false --> " + value);

        }

    }
}
