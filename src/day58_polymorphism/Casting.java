package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        // creating object of superman and variable of worker
        Worker worker = new SuperMan();
        worker.work("QA manager");
        worker.getPaid();

        // DOWNCASTING
        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("java developer");
    }
}
