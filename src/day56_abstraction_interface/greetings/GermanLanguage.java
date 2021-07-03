package day56_abstraction_interface.greetings;

import day56_abstraction_interface.greetings.Greeting;

public class GermanLanguage implements Greeting {

    @Override
    public void hi () {
        System.out.println("Hallo");
    }
    @Override
    public void bye (){
                System.out.println("Tschüss");
    }
}
