package day05_Primitives_concatanation;

public class JobInfo {
    public static void main (String [] args){
        String company = "Palo Alto Networks";
        String jobTitle = "Senior SDET";
        String jobDescription = "Java, Selenium, Cucumber";
        int salary = 200000;
        byte yearsOfExperience = 5;
        boolean hasBenefits = true;
        boolean hasBonuses = true;

        System.out.println ("Company:\t\t\t" + company);
        System.out.println ("Job Title:\t\t\t" + jobTitle);
        System.out.println ("Job Description:\t" + jobDescription);
        System.out.println ("Salary:\t\t\t\t$" + salary + "/year");
        System.out.println("Experience:\t\t\t" + yearsOfExperience);
        System.out.println("Benefits:\t\t\t" + hasBenefits);
        System.out.println ("Bonuses:\t\t\t" + hasBonuses);

    }
}
