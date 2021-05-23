package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {

            // declare/create new coffee object
        Coffee myCoffee = new Coffee();
            // see how much coffee we have now through accessing method
        System.out.println("coffee amount = " + myCoffee.getAmount());

            // let's fill it up through method refill
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());

            // let's drink some using method drunk
            // in () need to assign how much to drink
        myCoffee.drink(10);
        System.out.println("amount after drinking = " + myCoffee.getAmount());

            // choosing coffee type through method
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee type = " + myCoffee.getType());

        System.out.println(myCoffee.toString());
            // THIS METHOD PRINTS AMOUNT AND TYPE --> shows all variable values

        Coffee coffee1 = new Coffee();
        coffee1.setType("Cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        // assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("coffee2 type = " + coffee2.getType());

        Coffee coffee3 = new Coffee();
            // now it points to different type --> we declared new
        coffee3.setType("Frappuccino");
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null;
            // reference variable does not refer/point to anything - NullPointerException
        coffee4.setType("Turkish");

    }
}
