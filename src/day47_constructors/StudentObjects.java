package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {

        Student st1 = new Student();    // automatically called Student constructor --> whatever is typed there will be printed
        Student st2 = new Student();    // every time we create "new" object, constructor will run

        Student st3 = new Student("Mary");
        Student st4 = new Student ("Jane");

        Student st5 = new Student (21);
        Student st6 = new Student ("Helen", 24);
    }
}
