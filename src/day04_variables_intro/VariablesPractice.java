package day04_variables_intro;

import java.sql.SQLOutput;

public class VariablesPractice {
    public static void main(String [] args){
        // declare variable students that stores number
        int students; //we declared once and we keep reusing it below, changing value
        students = 50;
        System.out.println(students); //50
        System.out.println(students); // again 50
        students = 70;
        System.out.println(students); //70

        students = 111; // not printed because 135 goes after - top to bottom
        students = 135;
        System.out.println(students);

        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.print ("Number of teachers:");
        System.out.println (teachers); //2
        System.out.print("Number of mentors:");
        System.out.println (mentors); //25


    }
}
