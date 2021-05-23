package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        if (countryCode.equals (countryCode.toUpperCase())){ // checking if usa == USA
            System.out.println("Pass - case is correct");
        }else {
            System.out.println("Fail - case is incorrect");
        }

        String word = "Java";                   // print Java
        String uWord = word.toUpperCase();      // print JAVA

        if (word.equals(uWord)) {
            System.out.println("case match");
        }else {
            System.out.println("case mismatch");
        }
    }
}