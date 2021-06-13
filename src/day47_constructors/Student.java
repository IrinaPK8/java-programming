package day47_constructors;

import day06_arithmetic_operators.Age;

public class Student {

    // NO-ARGS CONSTRUCTOR

    public Student () {
        System.out.println("No-args constructor");
            // when we create student by new Student, it will run this code only
    }

        // we can add one more constructor here
    public Student (String name) {
        //constructor overloading with 1 param
    System.out.println("name param constructor | name = " + name);
   }

        // constructor with age
    public Student (int age){
        System.out.println("Age param constructor | age = " + age);
    }

    // constructor with name and age
    public Student (String name, int age) {
        System.out.println("Age and name param constructor | age = " + age + ", name = " + name);
    }
}
