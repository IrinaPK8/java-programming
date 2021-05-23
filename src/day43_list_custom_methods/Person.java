package day43_list_custom_methods;

public class Person {
    // data --> variables
    String firstName;
    int age;
    char gender;

    // behaviour --> method of the class
    public void speak() {
        System.out.println("person is speaking");

    }
        // public class which has two variables
        // for any object we create from this class Person we can use these variables/assign value for the object

}

class People{                                // this class is not public
                // this class is for running with main method
    public static void main(String[] args) {

        Person person1 = new Person();       // create object from Person class - Instantiation
                        // Instantiate Person class
        person1.firstName = "Bob";   // after object is created, we can assign variables and give value
        person1.age = 33;
        person1.gender = 'M';
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println("gender - " + person1.gender);
        person1.speak();        // calling it --> the printed message is already indicated in public void speak() --> no need to println

        Person person2  = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println("gender - " + person2.gender);
        person2.speak();

        // every time we create object from the class, each object will have its own copy of the variable
        // if we change value in one object variable, it will not affect the other one
        // we use new keyword to instantiate



    }
}
