package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
       double hourlyRate = 55;
       String reply = (hourlyRate > 45) ? "accept" : "reject";
       System.out.println(reply);
                    // OR WE CAN WRITE   System.out.println((hourlyRate > 45) ? "accept" : "decline");

        String todayClass = "Soft Skills";
        String teacher = (todayClass.equals ("Java")) ? "Murodil and Saim" : "Nadir";
        System.out.println("Today's teacher: " + teacher);

        boolean isEligibleToDrive = false;
             // "has DL, can drive"  , "no DL, cannot drive"
        String driving = (isEligibleToDrive) ?  "has DL, can drive" : "no DL, cannot drive";
        System.out.println(driving);

    }
}
