package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();           // 1st call the method
        displayMessage();           // 2nd call the method - can call as many time as necessary
        displayMessage();

        for (int i = 1; i <= 10; i++) {  // put in the loop to use it many times (e g , this loop to print 10 times)
            System.out.println(i + " - ");
            displayMessage();
        }
    }
    public static void displayMessage () {    // first custom reusable method
        System.out.println("Hello B22 friends!");
    }
}
