package day48_constructore_static;

public class Driver {
    private String name;

    public Driver() {       // empty constructor
    }

    public Driver(String name) {    // constructor with param
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                '}';
    }
}
