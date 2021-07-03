package day54_abstraction;

public class School {
    public static void main(String[] args) {
        // Student student = new Student();
        // cannot create object from Student class because Student is abstract

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
    }
}
