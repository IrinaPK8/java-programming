package day35_metods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5*5);
        displayValue(10);
        displayValue(-1);
        displayValue(100);

        int count = 60;
        displayValue(count);

        greetByName("Art");
        greetByName("Maria");
        String name = "Irina";
        greetByName(name);
    }
    public static void displayValue(int num){       // using int
        System.out.println(num);
    }
    public static void greetByName(String name) {               // using String
        System.out.println("Hello " + name + ", how are you today?");
    }
}
