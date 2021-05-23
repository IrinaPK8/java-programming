package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main (String [] args){
        System.out.println(10 == 10);   // true
        System.out.println(90 > 100);   // false
        System.out.println(50 < 60);    // true
        System.out.println(60 >= 60);   // true
        System.out.println(40 <= 39);   // false
        System.out.println(25 != 26);   // true

        System.out.println("============================");

        int a = 100;
        int b = 200;
        System.out.println(a==b);       // false
        System.out.println(a>b);        // false
        System.out.println(a<b);        // true
        System.out.println(a>=b);       // false
        System.out.println(a<=b);       // true
        System.out.println(a!=b);       // true

        System.out.println("============================");

        boolean result;
        result = 5 ==5;
        System.out.println(result);     //true

        result = 33 > 44;
        System.out.println(result);     //false
        
        result = 88 < 99;               //true
        System.out.println("result = " + result);

        result = 10 >= 10;              //true
        System.out.println("result = " + result);
        
        result = 123<= 124;
        System.out.println("result = " + result);
        
        result = 2 !=2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Baku");     // false
        System.out.println(city != "Fairfax");  //true

        String name = "Nadir";
        boolean checkName = name =="Nadir";
        System.out.println("checkName = " + checkName); // true

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName); // true

        int n1 = 5;
        int n2 = 3;
        boolean hungry = n1 != n2;
        System.out.println(hungry);

        int age = 2;
        boolean noMoreToddler = age > 3;
        System.out.println(noMoreToddler); // false

        age = 70;
        boolean ceniorCitizen = age >= 65;
        System.out.println("is senior citizen? - " + ceniorCitizen);     // true

    }
}
