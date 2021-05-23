package day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {

        String make = "Audi";                // Mercedes, Audi
        String model = "SQ5";               // E, A. SQ5,A3
        int price = 0;                  // A - 500, E - 400, SQ5 - 552, A3 - 412

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                price = 500;
            } else if (model.equals("A")) {
                price = 400;
            }

        } else if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                price = 552;
            } else if (model.equals("A3")) {
                price = 412;
            }
            System.out.println("Make" + make);
            System.out.println("Model " + model);
            System.out.println("Price $" + price);
        }else{
            System.out.println("Invalid entry");
        }
    }
}