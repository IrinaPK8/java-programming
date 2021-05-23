package OfficeHour.Practice_03_16_2021;

public class Bmi {
    public static void main(String[] args) {
       /* BMI: Program will ask users to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
—> BMI Formula: BMI = mass / height^2
—> Values:
        Less than 18.5 — Underweight
        From 18.5 to 25 — Normal weight
        From 25 to 30 — Overweight
        More than or equal to 30 — Obese */

        double kg = 85;
        double heightMeters = 1.61;
        double bmi = kg / (heightMeters * heightMeters);

        if (bmi < 18.5){
            System.out.println ("Underweight");
        }else if (18.6 <= bmi && bmi <= 25.00){
            System.out.println ("Normal weight");
        }else if (25.01 <= bmi && bmi <= 29.99){
            System.out.println ("Overweight");
        }else{
            System.out.println ("Obese");
        }

    }
}
