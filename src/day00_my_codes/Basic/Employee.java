package day00_my_codes.Basic;

public class Employee {

    public static void main (String [] args) {
        char first1 = 73;
        char first2 = 114;
        char first3 = 105;
        char first4 = 110;
        char first5 = 97;
        char last1 = 'K';
        char last2 = 'u';
        char last3 = 'l';
        char last4 = 'i';
        char last5 = 'k';
        byte email1= 8;
        char email2 = 64;                   // @ in ASCII table
        String companyName = "SpaceX";
        double salary = 170000;
        byte day = 3;
        String month = "October";
        int year = 2021;
        boolean fullTime = true;
        String jobTitle = "SDET Specialist";
        String address1 = "Hawthorne";
        char address2 = 67;
        char address3 = 65;

        System.out.println ("~~~~~~~~EMPLOYEE CARD~~~~~~~~");
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println ();
        System.out.println ("Employee Name: " + first1+first2+first3+first4+first5+" "+last1+last2+last3+last4+last5);
        System.out.println ("Email: irina" + email1 + email2 + "spacex.com");
        System.out.println ("Company Name: "+companyName);
        System.out.println ("Address: " + address1 + "," + address2 + address3);
        System.out.println ("Job Title: " + jobTitle);
        System.out.println ("Salary start: $" + salary);
        System.out.println ("Salary after 3 years: $" + (salary + (2 * 50000)));
        System.out.println ("Start Day: " + month + "," + day + "," + year);
        System.out.println ("Full time -->" + fullTime);
        System.out.println();

            /*  =====SpaceX new hire information=====
                Welcome to SpaceX, Irina!
                Your start date as SDET will be on October, 3, 2021.
                You are full time --> true and will be making $170000 per year.
                The office is located at Hawthorne, CA.
                    Official Information:
                New hire name: Irina Kulik
                Starts on: October, 3, 2021
                Email generated: irina5@spacex.com
                Your expected salary after 3 years: $270000
            */
        System.out.println ("=====" + companyName +" new hire information=====");
        System.out.println ("Welcome to " + companyName + ", " + first1+first2+first3+first4+first5);
        System.out.println ("Your start date as " + jobTitle + " will be on " + month + ", " + day + ", " + year + ".");
        System.out.println ("You are full time --> " + fullTime + " and will be making $" + salary + " per year, making $" + (salary + (2 * 50000)) + " in 3 years");
        System.out.println ("The office is located in " + address1 + ", " + address2 + address3);
        System.out.println ("\t\tOfficial  Information");
        System.out.println ("New Hire Name: " + first1+first2+first3+first4+first5+" "+last1+last2+last3+last4+last5);
        System.out.println ("Satrts on: " +  month + "," + day + "," + year);
                System.out.println ("Email generated: irina" + email1 + email2 + "spacex.com" );
                        System.out.println ("Your expected salary after 3 years: " + ( salary + (2 * 50000)));


    }
}
