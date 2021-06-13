package day53_inheritance.hiding;
        // SUB CLASS
public class Mobile extends Phone {
    String type = "Mobile phone";

    /* METHOD HIDING  --> static methods cannot be overridden
    * we are hiding use() static method */
    public static void use(){
        System.out.println("Using mobile phone");
    }

    public void text(){
        use();
        System.out.println(" and sending a text message");
    }

    @Override   // now when calling call() method, code will go here because overridden
            public void call(){
        use();
        System.out.println(" and calling on mobile");
    }
}
