package day00_my_codes.If_Else_Loop;

public class FirstLastNames {
    public static void main(String[] args) {
        /** Given two String variables. One is a full name and the second a last name.
         Check if the full name has the same last name as the other String.
         Ex:
         s: "james bond"
         s: "bond"
         output: Same last name

         s: "alex benji"
         s: "bond"
         output: Not the same last name */

        String fullName = "James";
        String lastName = "James";
        if (fullName.contains(lastName)) {
            System.out.println("Same last name");
        }else{
            System.out.println("Not the same last name");
        }

    }
}
