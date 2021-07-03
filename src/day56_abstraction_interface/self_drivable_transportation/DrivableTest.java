package day56_abstraction_interface.self_drivable_transportation;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.start();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.start();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();
        plane.bye();

        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();



    }
}
