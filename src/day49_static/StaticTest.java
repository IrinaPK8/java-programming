package day49_static;

public class StaticTest {

    static String word = "java";

    public static void main(String[] args) {
        // 1 - static method can be called using className.methodName();
        StaticMethods.displayMessage("wooden spoon");

        // 1 - instance method needs an object to be called
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // 2 - static method can only access/call other static variables or static methods
        System.out.println(word);

    }
}
