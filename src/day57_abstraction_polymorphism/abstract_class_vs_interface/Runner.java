package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        /* AbstractA absA = new AbstractA();
                 cannot create object/initialize from abstract class
         InterfaceA iA = new InterfaceA();
                 cannot create object/initialize from interface class*/

        InterfaceA.staticMethodE("wooden spoon");
        /* ConcreteA.staticMethodE("hello");  <-- ERROR
        child cannot use static method of parent interface */

    }
}
