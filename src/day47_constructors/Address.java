package day47_constructors;

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
