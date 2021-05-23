package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Boston";
        if (city.equals ("Moscow") || city.equals ("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering " + city);
        }

        String teacher = "Murodil";
        if (teacher.equals ("Murodil") || teacher.equals ("Saim")){
            System.out.println("It's Java class with " + teacher);
        }else if (teacher.equals ("Nadir")){
            System.out.println("It's soft skills class with " + teacher);
        }else {
        System.out.println("Some other class with " + teacher);
        }

            // company "Google", salary >= 100K --> accept offer
        String company ="SpaceX";
        double salary = 120_000.0;
        if (company.equals ("Google") || salary >= 100_000){
            System.out.println("I accept offer from " + company);
        }else{
            System.out.println("Rejecting offer from " + company);
        }

        }
    }
