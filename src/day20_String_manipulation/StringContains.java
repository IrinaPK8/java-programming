package day20_String_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));              // true
        System.out.println(company.contains("ital"));           // true
        System.out.println(company.contains("l o"));            // true
        System.out.println(company.contains("l O"));            // false - because case sensitive
        System.out.println(company.contains ("j"));

        /* if company contains space, print "Company name with multiple words"
         otherwise "Single word company name" */

        if (company.contains (" ")){
            System.out.println("Company name with multiple words");
        }else {
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
            // check if " | " is in

        if (etsyTitle.contains (" | ")) {
            System.out.println("Title check passed");
        }else{
            System.out.println("Title check failed");
        }

        String firstName = "ahmed";
        if (firstName.contains ("a") && firstName.contains ("e")){
            System.out.println(firstName + " contains a and e");
        }else {
            System.out.println(firstName + " does not contain a and e");
        }

        firstName = "Nadir";
        if (firstName.contains ("a") || firstName.contains ("e")){
            System.out.println(firstName + " contains a or e");
        }else {
            System.out.println(firstName + " contains neither a nor e");
        }

        String email = "kulikirina8@gmail.com";
        if (email.contains ("@") && email.endsWith (".com")){
            System.out.println("Valid email - email contains @ and ends with .com");
        }else{
            System.out.println("Invalid email - email does not contain @ and does not end with .com");
        }

        if (email.toLowerCase().contains("@") && email.toLowerCase().endsWith (".com")){        // chaining
            System.out.println("Valid email - email contains @ and ends with .com");
        }

    }
}
