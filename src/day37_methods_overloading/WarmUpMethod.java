package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {

        loginVoid("cybertekStudent", "abc123");  // positive outcome (Sunny Day some companies call it)
        loginVoid("cybertekStudent", "abcd123");    // negative outcome (Rainy Day some companies call it)

        System.out.println(login("cybertekStudent", "abc123"));

        if (login("cybertekStudent", "abc123") == true) {
            System.out.println("Login successful, welcome to Canvas!");
        }else {
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login ("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);
    }

    public static void loginVoid (String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful! Welcome to Cybertek!");
        }else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login (String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            return true;    /** this return exits code and does not go down */
        }
            return false; /** can leave this return without else because
                            return above will exit code and will not
                            go down here */

            /* ANOTHER WAY INSTEAD OF IF STATEMENT
             return username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);
             */
    }

}
