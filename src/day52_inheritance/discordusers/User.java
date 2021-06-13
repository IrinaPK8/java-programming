package day52_inheritance.discordusers;

public class User { // extends Object --> Object is parent of User automatically

    private String role;
    private String name;
    private int id;

    public User (){
        // empty constructor --> special method, no return,
        // same name, runs automatically when object is created
        System.out.println("User class constructor");
    }

    // overloading constructor
    public User(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
