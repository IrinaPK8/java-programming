package day53_inheritance.final_keyword;

import org.testng.annotations.Test;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
            //TestData.ADMIN_USERNAME = "Change";  --> cannot change like this, it is final

        // final variable can be inside main method too
        final int SSN = 123456789;
            //SSN = 321654987;  --> cannot change like this, it is final


    }
}
