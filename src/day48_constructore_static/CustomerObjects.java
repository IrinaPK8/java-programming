package day48_constructore_static;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);  // print with default values that are set in no args constructor

            // now let's change values
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);
            // another way to assign values in constructor in same statement
        Customer cs2 = new Customer ("Mike", 2);
        System.out.println(cs2);

        Customer cs3 = new Customer ("John", 3);
        System.out.println(cs3);

        System.out.println();

        // let's do ARRAY with the three above customers and add one more on the fly with all necessary params
        Customer [] todaysCustomers = {cs1, cs2, cs3, new Customer("Irina", 4)};  // this array has customer objects now
        System.out.println(todaysCustomers[0].toString()); // printing first from array at index 0
        System.out.println(todaysCustomers[1]);         // .toString() is optional
        System.out.println(todaysCustomers[2].toString());


        // let's use ARRAY LIST of customer objects now
        List<Customer> customersList = new ArrayList<>();
        // adding value to ArrayList (as many as we want because ArrayList size is mutable)
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Art", 5));     // creating object and giving value right inside the method <-- advantage of constructor
        customersList.add(new Customer("Someone", 6));

        // printing info of first customer object in array and array list
        System.out.println(customersList.get(0).toString());
        System.out.println(customersList.get(3).toString());
        System.out.println(customersList.get(4));
        // print info of each and every object
        System.out.println(customersList);

        // let's LOOP through this list ---> FOR LOOP
        System.out.println("________________FOR LOOP ________________");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }

        // ---> FOR EACH LOOP
        System.out.println("________________FOR EACH LOOP________________");
        for (Customer each : customersList) { // Customer because we have in <> --> List<Customer> customersList
            System.out.println(each);
        }

        // print ONLY NAMES OF ALL CUSTOMERS IN LIST --> USE LAMBDA
        System.out.println("________________NAMES OF CUSTOMERS ONLY (LAMBDA)________________");
        customersList.forEach(each -> System.out.println(each.getName())); // we use getName to pull out info from private --> calling getName method

        // print ONLY NAMES OF ALL CUSTOMERS IN LIST --> USE FOR EACH LOOP
        System.out.println("________________NAMES OF CUSTOMERS ONLY (FOR EACH)________________");
        for (Customer each : customersList){
            System.out.println(each.getName());  // we use getName to pull out info from private --> calling getName method
        }


    }
}
