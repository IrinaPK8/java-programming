package day15_logicalops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
                // int apples = 5;
                //!(apples >2) --> false, as condition is true but ! reverses it
                // !(apples <3) --> true, as condition is false and ! reverses it
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
                // check if age is not > 7 --> need to sit in child car seat
        if(!(age > 7)){
            System.out.println("Need to sit in a child car seat, age " + age);
        }else {
            System.out.println("Can sit in normal seat, age " + age);
        }

        System.out.println("===============================");

        boolean isSmokingAllowed = false;   // yes --> true, no --> false
                    // if smoking is not allowed, print "Smoking is not allowed here"
            if(!isSmokingAllowed){      // false here (due to !) equals to false in boolean assignment
                                        // that's why first condition is printed out
                System.out.println("Smoking is not allowed here");
            }else {
                System.out.println("This area is for smoking");
            }

            boolean isAffordable = true;
            if(!isAffordable){          // false here (due to !) does not equal to true in boolean assignment
                                        // that's why condition will not be printed out
                System.out.println("Not affordable");
            }

            String env = "qa";
            if (!env.equals("qa"));
            {
                System.out.println("In wrong environment for QA testing");
            }

            String carModel = "Tesla";
                // if other model is in string, print out will say Not interested
                // if it's not Tesla, I'm not interested
            if(!carModel.equals ("Tesla")){
                System.out.println("I'm not interested");
            }

            String secretPass = "abc123";
            String inputPass = "abc123";
                    // if inputPass is not equals secretPass, print "Incorrect Password"
            if (!inputPass.equals(secretPass));{
                System.out.println("Incorrect Password");
            }

            if(inputPass.equals(secretPass)) {
                System.out.println("Correct password");
            }

                /*int n = 1;
                if (n == 1){
                    System.out.println("n is 1");
                }else if (n == 2){
                    System.out.println();
                }else if (n == 3){
                System.out.println();
                }else (n == 4){
                    System.out.println();*/

    }
}
