package day00_my_codes.If_Else_Loop;

public class AgeGroup {
    public static void main(String[] args) {
                    /* Write a program that can define the age groups of a person.
                    Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.
                    Age groups: Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9), Pre-Teen (10 - 12), Teenager (13 - 17),
                    Young Adult (18 - 20), Adult (21 - 39), Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74), Senior Citizen (75 - 84), Old Senior Citizen (85+)
                    Based on the given age find and print which age group they are in. */

        int age = 7;
        if (age > 120 || age < 0){
            System.out.println ("Invalid entry");
        }else if (age >= 0 && age < 3){
            System.out.println("You are an infant");
        }else if (age >= 3 && age < 5){
            System.out.println("You are a toddler");
        }else if (age >= 5 && age < 9){
            System.out.println("You are a kid");
        }else if (age >= 9 && age < 12){
            System.out.println("You are a pre-teen");
        }else if (age >= 12 && age < 17){
            System.out.println("You are a teen");
        }else if (age >= 17 && age < 20){
            System.out.println("You are a young adult");
        }else if (age >= 21 && age < 39){
            System.out.println("You are an adult");
        }else if (age >= 39 && age < 49){
            System.out.println("You are a young middle-aged adult");
        }else if (age >= 49 && age < 54){
            System.out.println("You are a middle-aged adult");
        }else if (age >=54 && age < 64){
            System.out.println("You are a very young senior citizen");
        }else if (age >=64 && age < 74){
            System.out.println("You are a young senior citizen");
        }else if (age >= 74 && age < 84){
            System.out.println("You are a senior citizen");
        }else if (age > 85){
            System.out.println("You are an old senior citizen");
        }
    }
}
