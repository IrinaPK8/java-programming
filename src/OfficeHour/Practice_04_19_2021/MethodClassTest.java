package OfficeHour.Practice_04_19_2021;

public class MethodClassTest {
    public static void main(String[] args) {
        MethodClass.methodOne();  // void --> prints what is in custom method
        System.out.println(MethodClass.methodTwo()); // return --> value needs to be printed or used
        String s = MethodClass.methodTwo();
        MethodClass.methodTwo().trim().length();
        System.out.println(MethodClass.MethodThree("words")); // need to give parameter in ()
    }
}
