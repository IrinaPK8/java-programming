package day48_constructore_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        //  to call static method, we do not need to add object to call it
        //  to call it just use Classname.staticMethod --> static way of calling method
        Calculator.add(5, 3);

        //  to call non-static method, create object first --> instance/object method
        //  use "new" keyword first
        Calculator calcObject = new Calculator();
        calcObject.multiply(2, 4);

        // static method can also be called using an object
        calcObject.add(10, 45);



    }
}
