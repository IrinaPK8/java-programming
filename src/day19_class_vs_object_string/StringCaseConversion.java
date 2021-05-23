package day19_class_vs_object_string;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";

        System.out.println(word);                       // CyberTek
        System.out.println(word.toUpperCase());         // CYBERTEK
        System.out.println(word.toLowerCase());         // cybertek
        System.out.println("CyberTek".toLowerCase());   // cybertek
        System.out.println("CyberTek".toUpperCase());   // CYBERTEK
        System.out.println("IT IS FUN".toLowerCase());  // it is fun

                // we can convert words and full sentences!!!!
                // characters (e g !) do not convert

        word.toLowerCase();           // CyberTek - will not change to lower case because it is not assigned
        System.out.println(word);
        word = word.toLowerCase();    //cybertek -  will change to lower case because assigned
        System.out.println(word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());      // AMAZON
        System.out.println(company.toLowerCase());      // amazon
        System.out.println("Amazon".toUpperCase());     // AMAZON
        
                // change variable company Amazon to AMAZON
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
