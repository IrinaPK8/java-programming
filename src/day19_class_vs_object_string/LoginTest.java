package day19_class_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUsername = "cybertek";    // not case sensitive
        String expPassword = "Abc123";      // case sensitive
        String userName = "Cybertekk";      // not case sensitive
        String password = "abc123";         // case sensitive

            /* PSEUDOCODE -  when expectedUserName == userNAme and expectedPassword == password,
            then print "Pass - user successfully login", else "Fail - incorrect password"
             */

        if (expUsername.equalsIgnoreCase(userName) && expPassword.equals(password)){
            // non case sensitive user name and case sensitive password - match!
            System.out.println("Pass - user successfully login");
        }else {
         if (!expUsername.equalsIgnoreCase(userName)){
             System.out.println("Fail - user name is incorrect");
         }else {
             System.out.println("Fail - password is incorrect");
         }
        }
    }
}