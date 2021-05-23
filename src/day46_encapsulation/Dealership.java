package day46_encapsulation;

public class Dealership {

    public static void main(String[] args) {

    Car car1 = new Car();
            // Error below = model and year are private and cannot be accessed from a different class
            // car1.model = "Nissan Altima";
            // car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(10_000);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);  // automatically calls toString method

        System.out.println();

        Car car2 = new Car();
        car2.setModel("BMW");
        car2.setYear(2020);
        car2.setMileage(5_000);

        /* System.out.println("car2.getModel = " + car2.getModel());
        System.out.println("car2.getYear = " + car2.getYear());
        System.out.println("car2.getMileage = " + car2.getMileage());

        INSTEAD OF TYPING ALL ABOVE --> USE toString() method (see below)*/

        System.out.println(car2.toString());
        System.out.println(car2);

    }
}
