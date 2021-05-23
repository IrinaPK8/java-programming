package day16_switch_ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String drink = "cappuccino";
        String size = "big";           // tall, grande, venti
        double price;                   // 3.69, 3.99, 4.29
        int calories;                   // 90, 120, 150

        switch (size){
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println("Tall cappuccino, please\nPrice is $" + price + "\n" + calories + " calories");
                break;
            case "grande":
                price = 3.99;
                calories = 120;
                System.out.println("Grande cappuccino, please\nPrice is $" + price + "\n" + calories + " calories");
                break;
            case "venti":
                price = 4.29;
                calories = 150;
                System.out.println("Venti cappuccino, please\nPrice is $" + price + "\n" + calories + " calories");
                break;
            default:
                System.out.println("Sorry, we don't serve " + size + " size of cappuccino\nPlease, choose something else");
                }

               // System.out.println("Total price is $: " + price);             - CAN PUT THIS STATEMENT AFTER SWITCH AND IT WILL PRINT THE WORKING CASE
               // System.out.println("You will consume " + calories + "calories");   - CAN PUT THIS STATEMENT AFTER SWITCH AND IT WILL PRINT THE WORKING CASE
    }
}
