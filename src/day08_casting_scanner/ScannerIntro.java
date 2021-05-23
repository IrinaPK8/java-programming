package day08_casting_scanner;

    import java.util.Scanner; // 1. type on top of class (after package name)     --> import java.util.Scanner - it was saved in computer when Java was installed

public class ScannerIntro {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);      // 2. create Scanner object using NEW keyword       --> Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your name: "); // 3. ask a question/prompt    --> System.out.println ("Please, enter your name");
        String firstName = scan.next();    // 4. Capture the typed keyboard into value (take the input and store into variable )    --> String firstName = scan.next();
        System.out.println("Nice to meet you, " + firstName);   //  5. print the variable with message    --> System.out.println("Nice to meet you, " + firstName);
                                                                // --> then run the code and type name on the bottom under Please, enter your name (should be in green italics), hit enter


    }
}
