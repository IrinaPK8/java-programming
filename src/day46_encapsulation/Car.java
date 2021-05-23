package day46_encapsulation;

public class Car {              // this class is a template
        // ENCAPSULATED or hidden instance variables
    private String model;       // "private" is an access modifier
    private int year;
    private int mileage;

        // SETTER METHOD FOR MODEL --> setter method is ALWAYS VOID
    public void setModel(String carModel) {        // model in method name better be upper case --> naming conventions
                                        // this method can access private String model because they are in the same class
        model = carModel;
    }
        // GETTER METHOD FOR MODEL  -->  getter method is ALWAYS RETURN METHOD
    public String getModel (){
        return model;
    }

        // SETTER FOR YEAR
    public void setYear (int year){
        this.year = year;
        // this. means instance variable/indicates to instance variable
        // this. add when we have parameter with same name (int year in this method)
    }
        // GETTER FOR YEAR
    public int getYear() {
        return year;
    }

        // SETTER FOR MILEAGE
    public void setMileage (int mileage) {
        this.mileage = mileage;
    }

        // GETTER FOR MILEAGE
    public int getMileage (){
        return mileage;
    }

    // GENERATE STRING - right click - generate - toString - choose what variables to use
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
