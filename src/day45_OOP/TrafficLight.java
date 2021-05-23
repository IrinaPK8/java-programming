package day45_OOP;

// THIS IS A TEMPLATE CLASS, NOT RUNNING

public class TrafficLight {

        String color;

    public void showColor (){
            // read only method, showing value of color variable
        System.out.println("current color = " + color);
    }

    public void changeColor (String newColor){
            // method updates the value of color variable

            // through method we can control valid/invalid colors and assign if valid
        if (newColor.equals("red") || newColor.equals("yellow") || newColor.equals("green")){
            System.out.println("changing color to " + newColor);
            color = newColor;
        } else {
            System.out.println("Invalid color " + newColor);
        }
    }

}
