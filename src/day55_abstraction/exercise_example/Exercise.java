package day55_abstraction.exercise_example;

public abstract class Exercise {

    // adding start method in parent class so subclasses can reuse/inherit it
    public void start (){
        // start method is non abstract --> it does not have "abstract" keyword and it has implementation (println)
        System.out.println("Warming up and starting the exercise");
        // sub classes can or cannot override it
    }

    // adding abstract method without body/without implementation, just signature
    public abstract void perform();
    // purpose of abstract - let subclasses implement/override in their own way

    // adding another abstract method that concrete subclasses will override/implement
    public abstract int getCaloriesCount (int minutes);
    // this method is NOT VOID --> will return value (calories) based on parameter (minutes)

}
