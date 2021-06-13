package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage (String message) {
        System.out.println("message " + message);
            // ERROR --> System.out.println("num = " + num1); // static method but num1 is not static variable
        System.out.println("count = " + count);     // static method can use/call static variable
    }

    public static void anotherStaticMethod (){
        System.out.println("another static method");
        displayMessage("wooden spoon");

    }

    public void instanceMethod (){
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " +  count);
        displayMessage("Hello from instance method");
    }
}
