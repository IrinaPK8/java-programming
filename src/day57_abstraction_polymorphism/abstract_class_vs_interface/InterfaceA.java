package day57_abstraction_polymorphism.abstract_class_vs_interface;
// used to achieve abstraction in java

public interface InterfaceA {

        // adding variables
        // interface can only have PUBLIC STATIC FINAL VARIABLES
    public static final String TYPE = "interface";
    double MAX_COUNT = 500;  // this is public static final
        /* private int num; --> not working  */

    /* interface cannot have constructor
    public InterfaceA() {
        System.out.println("InterfaceA constructor - not welcome at interface");
    } */


    public abstract void absMethodD (int num) ;
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    public default void defaultMethodF (){
        //default is a method with a body in the interface
        System.out.println("defaultMethodF is called");
    }
}
