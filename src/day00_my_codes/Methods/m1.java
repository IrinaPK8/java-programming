package day00_my_codes.Methods;

public class m1 {
    public static void main(String[] args) {
        // because both methods are in same class
        // we do not need className.methodName();
        // method name is enough to call it
        method1();
    }
    public static void method1 (){
        int n = 5;

        for (int i = 0; i < 5; i++) {
            n += i;
        }
        System.out.println(n);
    }
}
