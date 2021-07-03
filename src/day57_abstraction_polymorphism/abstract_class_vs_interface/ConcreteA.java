package day57_abstraction_polymorphism.abstract_class_vs_interface;
/* non-abstract sub class (concrete class) can extend one abstract
and implement multiple interfaces*/

public class ConcreteA extends AbstractA implements InterfaceA {

    @Override // can override abstract method --> same name and params
    // concrete sub class must override abstract methods from abstract class or interface
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    // sub class can override non-final methods from parent class
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    // @Override --> cannot override static, static methods are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("abstractMethodD overridden version is called");
    }
}
