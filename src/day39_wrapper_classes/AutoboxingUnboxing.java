package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {

            // AUTO-BOXING  primitive --> Wrapper Class object
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;  // просто 234 is just a number, num3 is box for it

        int n = 100;
        Integer n1 = n;

        // UN-BOXING  Wrapper Class Object --> primitive
        Double d1 = new Double (100.5);
        double d2 = d1;
        double d3 = new Double(345.3);  // very rare way to unbox

    }
}
