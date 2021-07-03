package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal();  // not polymorphic --> data type and object are same
        a1.makeNoise();

        Animal animal1 = new Dog();  // polymorphism --> variable is parent type, object is child
        Animal animal2 = new Horse();  // polymorphism --> variable is parent type, object is child
        Animal cat = new Cat();  // polymorphism --> variable is parent type, object is child

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        // polymorphic list of objects
        // list data type is parent class
        // objects are child classes
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());
        for (Animal each : listOfAnimals){
            each.makeNoise();
        }
    }
}
