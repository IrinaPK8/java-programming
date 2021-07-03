package day57_abstraction_polymorphism.abstract_class_vs_interface;
// used to achieve abstraction in java

public abstract class AbstractA {

    // abstract class can have constructor --> runs first
    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    // adding variables
    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String language = "java";

    // adding methods --> cannot be private, static or final
    public abstract void absMethodA();

    public void methodB() {
        System.out.println("methodB called");
    }

    public static void staticMethodC() {
        System.out.println("staticMethodC is called");
    }
}
