package day51_inheritance_overriding;

public class Contractor extends Employee {

        @Override
            // lets know that you are overriding
            // ensures that this method is been overridden. If not, shows error
        public double calculateSalary (double hourlyRate){
            return 50 * 40 * hourlyRate;
        }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
