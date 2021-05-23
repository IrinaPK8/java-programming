package OfficeHour.Practice_03_24_2021;

public class CharIndex {
    public static void main(String[] args) {

        String s = "java";
        // System.out.println(s.charAt(s.length())); - COMPILE ERROR BECAUSE DUE TO CHARAT JAVA IS 0123
        System.out.println(s.charAt(s.length() -1));

       /* System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3)); */

        System.out.println(s.charAt(0) + "" + s.charAt(3));

        String upper = " " + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        System.out.println(upper);

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf("j") >= 0 ? "contains" : "not contains");
        System.out.println(s.indexOf("g") >= 0 ? "contains" : "not contains");

        System.out.println(s.toLowerCase().contains("a")); // you cannot chain after boolean is chained




    }
}
