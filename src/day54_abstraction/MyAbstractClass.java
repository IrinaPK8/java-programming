package day54_abstraction;

/*
ABSTRACT CLASS:
- we add abstract keyword to class to make it abstract
- cannot be instantiated, we cannot create objects from abstract classes
- they are meant to be extended by sub classes, so in order to use a method
or variable from the abstract class we need to have a subclass in the abstract
class which extends the abstract class
 */

public abstract class MyAbstractClass {
    int num = 55;

    public void learn() {
        System.out.println("Learning ....");
    }

    public abstract void close();
    //this is an abstract method/method with no implementation, just the signature.
    // It only shows what class can do but not how to do it, so no body
    }

    class Sub extends MyAbstractClass {
        public void close() {       // <-- Sub class also called CONCRETE CLASS - overrides/implements abstract method
                                    // by following rules of method overriding
            System.out.println("Close abstract method implementation");
        }
    }

    class MyObjects {
        public static void main(String[] args) {
            // MyAbstractClass mac = new MyAbstractClass();
            // ERROR: abstract class cannot be instantiated,
            // meaning we cannot create object from it

            // in order to use a method or variable from the abstract class
            // we need to have a subclass in the abstract class which extends
            // the abstract class

            Sub sub = new Sub();
            sub.learn();
            System.out.println(sub.num);
            // ???? Sub.close();
        }

    }
