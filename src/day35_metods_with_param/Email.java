package day35_metods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("crazyfrog", "gmail.com");
        buildEmail("Irina Kulik".replace(" ", "_").toLowerCase(), "gmail.com");
    }
    public static void buildEmail(String name, String domain) {
        System.out.println("Email is: " + name + "@" + domain);
    }
}
