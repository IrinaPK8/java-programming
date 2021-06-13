package day48_constructore_static;

public class BusObjects {
    public static void main(String[] args) {

        // declaring new object Bus
        Bus bus = new Bus();
        // assign driver object to this bus (directly because we did not use encapsulation)
        bus.driver = new Driver("Tom");
        // assign engine to this bus
        bus.engine = new Engine (10);
        // print all assigned bus info
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver ("Mike");
        metroBus.engine = new Engine (15);
        System.out.println(metroBus.toString());

        // print driver name only of metroBus
        System.out.println(metroBus.driver.getName());
    }
}
