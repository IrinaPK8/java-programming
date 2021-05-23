package day07_Arithmetic_operators_casting;

public class WarmUpClass {
    public static void main (String [] args){

        String city1 = "Chicago";
        String city2 = "Atlanta";
        double ticketPrice = 217;
        System.out.println ("From " + city1 + " to " + city2 + " is $" + ticketPrice + ".");
            // OR SAME RESULT
        String sentence = "From " + city1 + " to " + city2 + " is $" + ticketPrice + ".";
        System.out.println(sentence);


        String city3 = "Washington, DC";
        String city4 = "Omsk";
        int ticketPrice2 = 880;
        System.out.println ("From " + city3 + " to " + city4 + " is $" + ticketPrice2 + ".");
            // OR SAME RESULT
        String sentence2 = "From " + city3 + " to " + city4 + " is $" + ticketPrice2 + ".";
        System.out.println(sentence2);
    }
}
