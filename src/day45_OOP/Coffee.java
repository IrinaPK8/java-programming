package day45_OOP;
public class Coffee {

    int amount;
    String type;

    // OVERRIDE --> right click --> Generate --> toString --> ok
    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill (){
        // ASSIGNING VALUE TO VARIABLE AMOUNT USING THIS METHOD
        // this method makes sure our amount is full/100%
        amount = 100;  // method makes sure amount is always 100 --> full
    }

    public void drink (int someAmount) {
        //  METHOD SHOWING HOW MUCH WE ARE DRINKING
        amount -= someAmount;
        // exact amount will be indicated in runner class
    }

    public int getAmount (){    // return method (without void in its name)
        return amount;
    }

    public void setType (String newType){
            // GETTING TYPE OF COFFEE METHOD
            // we are updating what we are drinking
        type = newType;
    }

    public String getType (){
            // METHOD TO GET/PRINT TYPE OF COFFEE (FROM SET TYPE)
        return type;
    }
}
