package day47_constructors;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class Address {

    /** Encapsulated Data in the address:
     String street
     String city
     String state
     String zipCode
     String country = "USA";

     generate: getters/setters */

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //CONSTRUCTOR
    public Address () {// type "public", then class name it is in "Address", then (), then {}
        System.out.println("Address constructor");      // can add some message inside method
        street = "123 unknown st";
        city = "Unknown";
        state = "Unknown";
        zipCode = "00000";

        // special method, no return type, same name as class name it is in
        // can have more than 1 constructor
        // to call constructor in other class --> Address newAddress = new Address(); (<-- object created)
        // whatever is types in public Address will be printed in runner class when object is created
        // you run/call constructor one time for one object
        // if I wanna change values for same object --> use setters
    }

    // SECOND CONSTRUCTOR, OVERLOAD CONSTRUCTOR provides shortcut to initialize variables in same statement
    // example:  Address ad = new Address("123 Main st", "Boston", "MA", "12345");
    public Address (String street, String city, String state, String zipCode) {
        if (street.isEmpty() || street.length() >50) {
            System.out.println("Invalid String");
        }else {
            this.street = street;       // otherwise assign it, reuse code in setter method
            this.state = state;
            this.zipCode = zipCode;
        }

    }

    public String getStreet () {
        return street;
    }
    public void setStreet (String street) {
        this.street = street;
    }

    public String setCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState(){
        return state;
    }
    public void setState (String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode (String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry () {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    /** write/generate: toString
     "123 Java St Apt 101, Selenium, VA 22102"  */

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

}
