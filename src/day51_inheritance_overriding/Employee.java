package day51_inheritance_overriding;

public class Employee extends Object {

    String jobTitle;

    public double calculateSalary (double hourlyRate){
        double annualSalary = hourlyRate * 40 * 52 * 1.1;
        return annualSalary;
        // or can write return annualSalary = hourlyRate * 40 * 52 * 1.1;
    }

        // toString method is inherited from Object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
