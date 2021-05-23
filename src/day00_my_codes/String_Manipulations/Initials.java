package day00_my_codes.String_Manipulations;

public class Initials {
    public static void main(String[] args) {
        /** [Initials]
        Given a person's name in a String (first and last name), then prints out the initials of the user.
         The initials should be uppercase.
        Ex:
        input: james bond
        output: your initials are JB */

        String fullName = "James Bond";
        String fNameInitial = fullName.toUpperCase().substring(0, 1);
        String lNameInitial = fullName.toUpperCase().substring(fullName.indexOf(" ") +1, fullName.indexOf(" ") +2);
        System.out.println("Your initials are " + fNameInitial + lNameInitial);

    }
}
