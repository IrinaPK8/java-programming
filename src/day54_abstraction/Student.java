package day54_abstraction;

// create abstract class Student --> add keyword "abstract"
// cannot create object of Student class
public abstract class Student {

    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    // we can add abstract method in abstract class
    // --> add "abstract" keyword to new class
    // it does not have implementation/method body
    // abstract class only shows what it can do but not how by using abstract methods

    public abstract void attendClass();
}
