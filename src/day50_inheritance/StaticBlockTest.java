package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();     // static runs --> constructor
        StaticBlockDemo st2 = new StaticBlockDemo();     // constructor runs each time we create object
        StaticBlockDemo st3 = new StaticBlockDemo();     // object is created --> constructor will run
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);            // 75

    }

}
