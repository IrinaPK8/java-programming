package day45_OOP;

// RUNNER CLASS FOR TRAFFIC LIGHT CLASS

public class TrafficLightObject {   // runner method for TrafficLight
    public static void main(String[] args) {

        // CREATE TRAFFIC LIGHT OBJECT

        TrafficLight trafficLight = new TrafficLight(); // creating new object from TrafficLight class

            // we will assign the value of color using method of class

        trafficLight.changeColor("red");   //control color using method changeColor
            //best way to assign --> can control it now (e.g. if statement...)

            // System.out.println(trafficLight.color); --> direct access to variable - NOT RECOMMENDED
            // BETTER - to call method to access variable
        trafficLight.showColor();   // show color

            // LET'S CHANGE COLOR NOW
        trafficLight.changeColor("green"); // change color
        trafficLight.showColor();           // show color

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("black");
        trafficLight2.showColor();

    }
}
