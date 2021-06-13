package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Jane";
        p1.age = 30;
        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.name = "John";
        t1.teacherID = 1234;
        t1.age = 25;
        t1.talk();
        t1.walk();
        t1.teach("Java");

        Student student = new Student();
        student.schoolName = "Cybertek";
        student.name = "Irina";
        student.age = 37;
        student.walk();
        student.talk();
        student.work("SDET");
        student.study("Java inheritance");
    }
}
