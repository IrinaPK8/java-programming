package day05_Primitives_concatanation;

public class UsingVariables {
    public static void main (String [] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println (num1); //prints 100
        System.out.println(num2); // prints 100

        num1 = 200;
        num2 = num1;
        System.out.println(num1); //prints 200 cause we changed value
        System.out.println(num2); // prints 200 cause we changed value

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        /* n1 -> 55
           n2 -> 55
           n3 -> 55
         */
        System.out.println(n1);
        System.out.println(n2);

        int zipCode1 = 22182;
        int zipCode2 = zipCode1;
        System.out.println(zipCode2);
        zipCode1 = 20007;
        System.out.println(zipCode1); //because we changed zipCode1 value
        System.out.println(zipCode2);  // we did not change zipCode2 value, no change here
        zipCode2 = 33131;
        System.out.println(zipCode2); // because we changed zipCode2 value now


    }
}
