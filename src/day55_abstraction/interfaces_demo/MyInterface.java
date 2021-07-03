package day55_abstraction.interfaces_demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public interface MyInterface {
    // cn type like this  --> void learn ();    OR like below
    public abstract void learn();
}

interface MyInterface2 {

}

class MyClass implements MyInterface, MyInterface2 {
    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}

class Main {
    public static void main(String[] args) {
        // MyInterface myInterface = new MyInterface(); <-- ERROR, cannot create object of interface
        MyClass myClass = new MyClass();
    }
}
