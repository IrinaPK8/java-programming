package day13_conditional_statements;
public class IfWithBoolenVariable {
    public static void main(String[] args) {

        boolean isHungry = true;
        if (isHungry){              // OR (isHungry == true)
            System.out.println("Hungry - I'll get smth to eat");
        }else {
            System.out.println("Not hungry - let's code Java");
        }

        System.out.println("===================");

        double price = 201;
        boolean isAffordable = price <= 200;
        if(isAffordable){
            System.out.println("I can afford, let's buy");
        }else{
            System.out.println("I cannot afford, too expensive");
        }
        System.out.println("===================");

        boolean isRemoteJob = true;
            // if not remote print "Sorry, I'm not interested"
            // otherwise, print "I'm interested..... "
            // if (isRemoteJob 1= true)
        if(! isRemoteJob){                              // ! means NOT
            System.out.println("Sorry, I'm not interested");
        }else{
            System.out.println("I'm interested. What is the interview process?");
        }




    }
}
