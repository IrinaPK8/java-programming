package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running();      // polymorphism
        Running running = new Running();
        Swimming swimming = new Swimming();
        Lifting lifting = new FreeWeight();        // polymorphism
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min - calories burnt = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 min - calories burnt = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Running 30 min - calories burnt = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Free weight 30 min - calories burnt = " + freeWeight.getCaloriesCount(30));

    }
}
