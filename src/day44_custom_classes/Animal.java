package day44_custom_classes;

public class Animal {                               // purpose of this class is to use it as template for our object

    String type = "Some animal";
    public void eat () {
        System.out.println("eating");
    }
    public void eat(String food) {                  // method overloading with parameter
        System.out.println("eating" + food);
    }
    public void speak(){
        System.out.println("speaking");
    }
 }

    class AnimalObject {                            // purpose of this class is to use it as runner
        public static void main(String[] args) {    // this class has to have main method

            Animal animal = new Animal();           // creating new object, through it we will pull out info from another class
            System.out.println(animal.type);        // this class takes type value from Animal class and prints it
            animal.eat();
            animal.eat(" grass");                   // this class takes eat behaviour from Animal class and prints it
                                                    // passing parameter "grass"
            animal.speak();
            System.out.println();

            // CREATE OBJECT variable cheetahObj
            Animal cheetahObj = new Animal();
            cheetahObj.type = "cheeath";            // reassign to print "cheetah" instead of "some animal"
            System.out.println(cheetahObj.type);
            cheetahObj.eat();
            cheetahObj.eat(" meat");                // assign new parameter to cheetahObj
            cheetahObj.speak();
        }
    }