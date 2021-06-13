package day48_constructore_static;

public class Customer {
    private String name;
    private int id;

    // NO ARGS CONSTRUCTOR - same name as class name, no params
    public Customer () {
        System.out.println("No-args constructor");
        // we can give some values
        name = "new customer";
        id = -1;
    }
    //ad constructor with params where we assign name and id
    public Customer(String name, int id) {
        System.out.println("2-args constructor");
        this.name = name;       // OR setName(name); <-- setter
        this.id = id;           // OR setId(id);    <--setter <-- can use this method to assign when there is some condition in setter to reuse this condition
          }


    //ENCAPSULATION
    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public int getId () {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
