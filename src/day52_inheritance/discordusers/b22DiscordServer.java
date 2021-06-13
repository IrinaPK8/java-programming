package day52_inheritance.discordusers;

public class b22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Irina");
        user1.setRole("Student");

        System.out.println();
                // admin class is without setter/getter --> using parent class to print
        Admin admin = new Admin();
        admin.setId(4321);
        admin.setName("Art");
        admin.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin);
        System.out.println();

        Admin admin2 = new Admin("Gulia", 4138);
        System.out.println(admin2.toString());

    }
}
