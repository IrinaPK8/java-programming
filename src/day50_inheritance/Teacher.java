package day50_inheritance;
/** SUB / CHILD / DERIVED CLASS */

public class Teacher extends Person{
    int teacherID;

    public void teach (String topic){
        System.out.println("Teacher is teaching " + topic);
        System.out.println(name + "'s age is " + age + " years old");
        System.out.println(name + "'s teacher's ID is #" + teacherID);
    }

}
