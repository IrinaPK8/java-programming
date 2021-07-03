package day56_abstraction_interface.greetings;

import day56_abstraction_interface.greetings.GermanLanguage;
import day56_abstraction_interface.greetings.Greeting;
import day56_abstraction_interface.greetings.Japanese;

public class GreetingActions {
    public static void main(String[] args) {

        GermanLanguage gl = new GermanLanguage();
        gl.hi();
        gl.bye();

        Greeting gt = new GermanLanguage();
        gt.hi();
        gt.bye();

        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();
    }
}
