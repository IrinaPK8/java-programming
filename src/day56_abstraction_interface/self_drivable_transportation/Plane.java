package day56_abstraction_interface.self_drivable_transportation;

import day56_abstraction_interface.greetings.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile*26.0) + " to fly " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thank you for flying with us");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on auto-pilot mode");
    }

    public void land() {
        System.out.println("Plane is landing at destination city");
    }
}
