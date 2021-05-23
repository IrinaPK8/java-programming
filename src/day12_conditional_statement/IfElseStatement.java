package day12_conditional_statement;
public class IfElseStatement {
    public static void main (String [] args){
                // "IF" IS THE CONDITION TO BE CHECKED FIRST - IF IT IS TRUE, IT WILL RUN AND PRINT THE STATEMENT(S) IN "IF" {}
                // IF "IF" CONDITION IS FALSE, IT WILL RUN AND PRINT THE STATEMENT(S) IN "ELSE" ()
        if(10 > 5){
            System.out.println("condition is true");       // 10 is greater than 5
        }
        else {                                              // else condition will be skipped if first (if) is true
            System.out.println("condition is false");       // 10 is less that 5
        }


        int count = 25;
        if(count > 30){
            System.out.println("count is more than 30");    // false, this line will not be typed
        }
        else{
            System.out.println("count is less than 30");    // true, this line will be typed
        }


        int age = 30;
        if (age >= 18){
            System.out.println("Eligible vote");
            System.out.println("Age is greater or equals 18");
        }
        else{
            System.out.println("Not eligible vote");
            System.out.println("Age is less than 18");
        }

            /*  ==CONDITION IS TRUE==
               A               - WILL RUN BECAUSE IF IT BEFORE IF STATEMENT AND DOES NOT DEPEND ON CONDITION
            if(CONDITION) {
               B               - WILL RUN BECAUSE CONDITION IS TRUE
            }
            ELSE {
               C               - WILL NOT RUN BECAUSE CONDITION IS TRUE
            }
               D               - WILL RUN BECAUSE IT IS AFTER THE STATEMENT, DOES NOT DEPEND ON CONDITION
             */
    }
}
