package day20_String_manipulation;

public class StringIsEmpty {
    public static void main (String [] args){

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());         // true
        System.out.println(jobTitle.length());          // 0
        System.out.println(jobTitle.length() == 0);     // true

        jobTitle = " ";                                 // space is considered to be a character so it counts
        System.out.println(jobTitle.isEmpty());         // false
        System.out.println(jobTitle.length());          // 1 because space is a character

                   // // WAYS TO CHECK IF STRING EMPTY OR NOT // //

        if (jobTitle.isEmpty()){
            System.out.println("No job title, please resend");
        }else {
            System.out.println("Job title looks good");
        }

        if (jobTitle.length() == 0){
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if ("".equals(jobTitle)){
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());             // false - space is a character
        System.out.println(word.length());              // 1 - space counts

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());           // false

                    // IF VEGGIE IS NOT EMPTY - PRINT "We have carrots"
        if (!veggie.isEmpty()){                         // ! at the beginning means "NOT" - if veggie is not empty
            System.out.println("We have " + veggie);
        }

        String word2 = "Word";
        System.out.println(word2.isEmpty());
        // will show error if we do - String word2; - needs to have value inside - = ...
    }
}
