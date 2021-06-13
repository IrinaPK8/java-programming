package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        // creating object
        // need to add params in () because in template class constructor is with params
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());

        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() + " - " + ec1.getMake() + " is out of my budget");
        }else {
            System.out.println("Purchasing " + ec1.toString());
        }

    }
}
