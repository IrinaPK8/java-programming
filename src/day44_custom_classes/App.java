package day44_custom_classes;

public class App {                                  // creating object from this class, used as template for app objects
        // attribute/data/instance variable
    String name;                            // describing app properties/actions/behavior/methods
    double version;

    // behavior / methods
    public void open (){            // use name and version variable in this method // void means no returning value
                                // when we write behavior most of the time our method is used to process/use our data/variables
        System.out.println(name + " " + version + " is opening");
    }
    }

    class MyApps {                      // this class is used to create objects off App class
    public static void main(String[] args) {
                                //String app1 = "Uber"; // this is String object, just characters
        App uberApp = new App();        // creating new object
        uberApp.name = "Uber";
        uberApp.version = 3.2;
        uberApp.open();                 // call open method using object variable



    }
}

