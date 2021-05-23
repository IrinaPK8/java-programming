package OfficeHour.Practice_05_17_2021;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(5, 3);
        System.out.println(rectangle.getArea());

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getArea());

    }

     //-Create these variables in the class: width, height, area(all double)
    // -Create these methods (non-static):
    // -setDimensions()
    // -parameters: width, height (Do not name the parameters the same as your class variable names)
    // -return: void
    // -action: assigns the width and height of the object given from the parameters.
    // Also calculate the area of the rectangle in the method and store to the area variable.
    // (area = width * height)
    // -getArea()
    // -parameters: none
    // -return: double
    // -action: returns the area variable
    // -toString() generate the toString method as shown in class.
    // -Create a class RectangleObjects
    // -Create Rectangle objects, call the set Dimensions and getArea methods of the objects

    double height;
    double width;
    double area;

    public void setDimensions (double recHeight, double recWidth) {
        height = recHeight;
        width = recWidth;
    }

    public double getArea () {
        area = width * height;
        return area;
    }
}
