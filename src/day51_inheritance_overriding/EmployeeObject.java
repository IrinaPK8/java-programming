package day51_inheritance_overriding;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee developer = new Employee();
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));

        // can store variable
        double annualDevSalary = developer.calculateSalary(62.0);
        System.out.println("annualDevSalary = " + annualDevSalary);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));
        developer.jobTitle = "Java Developer";
        System.out.println(developer.toString());

        System.out.println();

        Contractor sdetContractor = new Contractor();
        double sdetSalary = sdetContractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);
        sdetContractor.jobTitle = "SDET";
        System.out.println(sdetContractor.toString());

    }
}
