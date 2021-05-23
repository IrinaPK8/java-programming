package day14_multi_branch_if_statement;

public class LogicalANDOperator {
    public static void main (String [] args){
        System.out.println(true && true);           // TRUE
        System.out.println(true && false);          // FALSE
        System.out.println(false && true);          // FALSE
        System.out.println(false && false);         // FALSE

        System.out.println(10>5 && 1 == 1);         // TRUE
        System.out.println(3 == 5 && 10 < 20);      // FALSE
        System.out.println(3 > 2 && 5 > 2);         // TRUE
        System.out.println(12 < 13 && 15 == 14);    // FALSE

        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges >3;   //TRUE
        System.out.println("Checks = " + check);

        if(apples > 6 && oranges >2){
        System.out.println("I have enough apples and oranges");
        }else {
            System.out.println("I need to buy more fruit");
        }

    }
}
