package day54_abstraction;

public class Salad extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Cut veggies, add dressing to prepare salad");
    }

    @Override
    public void serve() {
        System.out.println("Serve in a bowl, provide with silverware");
    }
}
