package day56_abstraction_interface.greetings;

public class Japanese implements Greeting {
    @Override
    public void hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void bye() {
        System.out.println("さようなら");

    }
}
