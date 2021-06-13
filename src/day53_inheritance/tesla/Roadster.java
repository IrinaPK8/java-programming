package day53_inheritance.tesla;

        //INHERITANCE
public class Roadster extends ElectricCar {
/* when we create object of sub class, java first creates object of super class by calling its constructor
 --> while creating object of parent class, java runs constructor of parent class then child gets executed.
Java first runs parent class constructor (ElectricCar), then runs child class constructor (Roadster).
If parents class has no No-Args default constructor, child class constructor must make super (params) call,
otherwise it will not compile */

    public Roadster(String model, double price, int year, int range) {
        // !!! super () needs to be the first line/statement in the constructor !!!
        super("Tesla", model, price, year, range);  //"Tesla" is hardcoded, because it is always tesla in this code
                                                    // and we removed param "make" from constructor ()


    }
}
