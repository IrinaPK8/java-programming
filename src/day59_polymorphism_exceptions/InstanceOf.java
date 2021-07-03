package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.Shapes.Circle;
import day57_abstraction_polymorphism.Shapes.Shape;
import day57_abstraction_polymorphism.Shapes.Square;

public class InstanceOf {

    public static void main(String[] args) {
        // INSTANCE OF OPERATOR

        Shape shape = new Circle();

        // is the object of shape variable referring to instance of circle or not?
        System.out.println(shape instanceof Circle);  // returns boolean = true

        // is the object of shape variable referring to instance of square or not?
        System.out.println(shape instanceof Square);    // returns boolean = false

        if (shape instanceof Circle) {
            System.out.println("it is a circle object");
        }else if (shape instanceof Square) {
            System.out.println("it is a square object");
        }

        System.out.println(shape.getClass());

    }

}
