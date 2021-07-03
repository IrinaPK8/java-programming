package day54_abstraction;

public class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Stretch dough, add topping, bake in oven");
    }

    @Override
    public void serve() {
        System.out.println("Cut in slices");
    }
}
