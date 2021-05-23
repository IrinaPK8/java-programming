package day00_my_codes.If_Else_Loop;

public class StreetLight {
    public static void main(String[] args) {
       /* [Street light] You are at a street line. The color of the street line will determine what you should do.
        Green light - Print "Go"
        Yellow light - Print "Slow down"
        Red light - Print "Stop"*/

        String light = "Yellow";
        if (light == "Green"){
            System.out.println ("Go");
        }
        if (light == "Yellow") {
            System.out.println ("Slow down");
        }
        if (light == "Red") {
            System.out.println("Stop");
        }
    }
}
