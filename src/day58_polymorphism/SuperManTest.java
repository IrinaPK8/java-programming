package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();   // polymorphism
        // when superman is father he can access methods in Father only:
        spMan1.raiseKid();
        spMan1.feedKid();
        spMan1.playWithKid();

        // when superman is worker he can access methods in Worker only:
        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        System.out.println(spMan2.getPaid());

        // when superman is SuperMan, he can access all methods
        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Senior SDET");
        spMan3.feedKid();
        spMan3.raiseKid();
        spMan3.playWithKid();
    }
}
