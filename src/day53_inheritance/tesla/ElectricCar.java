package day53_inheritance.tesla;
        // TEMPLATE CLASS
public class ElectricCar {
        // declare variables --> encapsulation
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;       // all objects will share this variable
            public final static int MAX_RANGE = 400;

            public final void charge () {
                System.out.println("Charging the electric car using plug");
                this.range = MAX_RANGE;
            }

        // declare protected behaviour --> can only be used by subclasses
    protected void drive (int miles) {
        if (range == 0 || range - miles < 0) {
            System.out.println("ERROR: Cannot drive that far, need to charge");
        } else {
            range -= miles;                      // miles variable is declared in the param
            System.out.println("Driving " + miles + " miles ...");
        }
    }

        // generate getters and setters for private variables and behavior
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make.isEmpty()){
            System.out.println("ERROR: make cannot be blank");
        }else {
            this.make = make;
        }
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

    public static int getCount(){
        return count;           // no need in setter, just count
            }

            // generate toString
    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }
            // generate CONSTRUCTOR
            // once we create our customer constructor, java will use this one (not the empty one which is created by java by default)
    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make);              // another way to set the make --> more common when setter has some condition (look above for this setter)
        this.model = model;         // this way allows any type of data to be assigned (no condition set above)
        this.price = price;
        this.year = year;
        this.range = range;
        count++;                    // increase count by one every time new car is created
    }


}
