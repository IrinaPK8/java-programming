    package day15_logicalops_switch_ternary;

    public class UsedCarSelector {
        public static void main (String [] args){

            double budget = 5000;
            String model = "Toyota";    // Honda, Tesla or Toyota;
            double carPrice = 4999.0;
            if (budget >= carPrice && (model.equals ("Toyota") || model.equals ("Honda") || model.equals ("Tesla"))){
                System.out.println("Would like to purchase " + model + " at $" + carPrice);
            }else{
                System.out.println("Not interested in " + model + " at $" + carPrice + "\nWhat else do you have?");
            }
        }
    }
