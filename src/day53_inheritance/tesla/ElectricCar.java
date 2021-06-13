package day53_inheritance.tesla;

public class ElectricCar {
        // TEMPLATE CLASS

        // encapsulating variables
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;

        // protected behaviour --> can only be used by subclasses
    protected void drive (int miles) {
        if (range == 0 || range - miles < 0){
            System.out.println("ERROR: Cannot drive that far, need to charge");
        }else {
            range -= miles;                 // miles variable is declared in the param
            System.out.println("Driving " + miles + " miles... ");
        }
    }

        // getters and setters for private variables
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
