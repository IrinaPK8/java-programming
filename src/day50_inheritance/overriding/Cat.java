package day50_inheritance.overriding;
/** SUB / CHILD / DERIVED CLASS */
public class Cat extends Animal {
    public void jump(){
        System.out.println("Cat is jumping");
    }

    @Override       // this line is optional but good to have
    public void speak (){
        System.out.println("Cat says MEOW");
    }
}
