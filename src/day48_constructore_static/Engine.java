package day48_constructore_static;

public class Engine {
    private int cylinders;

    public Engine(int cylinders) {  // constructor with param
        this.cylinders = cylinders;
    }

    public Engine() {               // empty constructor
    }

    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }
}
