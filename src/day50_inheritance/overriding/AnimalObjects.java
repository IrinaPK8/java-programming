package day50_inheritance.overriding;
/** RUNNER CLASS */
public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "German Shepherd";
        animal.speak();

        Cat cat = new Cat();
        cat.name = "Mimi";
        System.out.println(cat.name);
        cat.speak();
        cat.jump();

        Dog dog = new Dog();
        dog.speak();
        dog.run();
    }
}
