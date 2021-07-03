package day56_abstraction_interface.self_drivable_transportation;

public interface SelfDrivable {

    void autoPiloting ();
    // void selfPArk(); --> will not work

    public default void selfPark(){             // adding default method
        System.out.println("Performing self parking steps");
    }
}
