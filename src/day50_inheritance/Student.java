package day50_inheritance;
/** SUB / CHILD / DERIVED CLASS */
public class Student extends Person {

        String schoolName;

        public void study (String topic){
            System.out.println(name + " studies " + topic + " at " + schoolName);
            System.out.println(name + "'s age is " + age + " years old");
        }

}
