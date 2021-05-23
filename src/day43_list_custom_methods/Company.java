package day43_list_custom_methods;

public class Company {
    public static void main(String[] args) {
        //add 3 objects of Employee class
        //assign name and job titles
        //call work method -- > Employee

        Employee emp1 = new Employee();
        emp1.name = "Maria";
        emp1.jobTitle = "Developer";
        emp1.work();
            // java takes println from Employee class
            // and assigns to it variables from this class

        Employee emp2 = new Employee();
        emp2.name = "Irina";
        emp2.jobTitle = "SDET";
        emp2.work ();


    }
}
