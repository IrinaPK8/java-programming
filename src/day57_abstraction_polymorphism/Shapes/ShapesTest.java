package day57_abstraction_polymorphism.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        Shape pentagon = new Pentagon();
        pentagon.draw();

        /** Create list of shapes and store 10
         * different shapes using loop print each shape */

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(square);
        shapes.add(pentagon);
        shapes.add(new Triangle()); //  <-- new object of triangle
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Pentagon());
        shapes.add(new Circle());
        shapes.add(new Circle());

        /* System.out.println(shapes);
        not working - prints hash codes of objects
        --> need to do through loop
         */

        for (Shape each : shapes) {
            each.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);
    }

    /* create static method that accepts any object (accepts drawShape)
    of different type of shapes and it will draw it (calls draw method)
    each time, do not overload */
    public static void drawShape (Shape shape) {
        System.out.println("---Drawing shapes---");
        shape.draw();
    }
}
