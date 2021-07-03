package day54_abstraction;

    // OnlineStudent class extends Student abstract class --> add "extends Student"
    // this class is considered to be CONCRETE CLASS
    // it is responsible to implement all abstract methods

public class OnlineStudent extends Student {

    // attendClass abstract method is implemented by sub class
    // sub class is overriding abstract method of parent class

    // let's override attendClass of parent (it is empty in parent now) for OnlineStudent
    @Override
    public void attendClass() {
        System.out.println("Online student is attending class via Zoom");
    }
}
