package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startCar();
        shiftToDrive();
        startDriving();
    }
    public static void sitInCar() {
        System.out.println("1. Open the door and sit in driver's seat");
    }
    public static void startCar() {
        System.out.println("2. Put the key in ignition, turn and start the car");
    }
    public static void shiftToDrive() {
        System.out.println("3. Shift to drive and push the gas pedal");
    }
    public static void startDriving() {
        System.out.println("4. Start driving and stay safe on the road!");
    }
}
