package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {

    public static class Inner {
        // variables and methods of inner static class

    }
    static int num;
    static List<String> carModels;
    static {            // static method runs ONE TIME ONLY before everything else in class

        System.out.println("Static initializer block");

        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("BMW", "Mercedes", "Toyota", "Mercedes", "Maybach"));
    }


    {       // INITIALIZER BLOCK --> runs each time object created before the constructor
        System.out.println("Initializer block");
    }


    // lets ADD CONSTRUCTOR HERE
    public StaticBlockDemo(){
        System.out.println("Constructor method"); // will run each time object is created
        num +=5;
    }
    // OVERLOAD METHOD --> add same name class but with parameter
    public StaticBlockDemo(int value){
        System.out.println("Overloaded constructor");
        num += value;
    }

}
