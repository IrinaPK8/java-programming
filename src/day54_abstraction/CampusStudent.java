package day54_abstraction;

public class CampusStudent extends Student {

    // let's override attendClass of parent (it is empty in parent now) for CampusStudent
    @Override
    public void attendClass() {
        System.out.println("Campus student is attending the class in person");
    }

}
