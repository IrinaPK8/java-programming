package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double [] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};

        // print all numbers from prices array that are > 100

        System.out.println("=======Prices less than 100=======");
        for (double eachPrice : prices){
            if (eachPrice > 100.0){
                System.out.print(eachPrice + " ,");
            }
        }

        System.out.println("\n========PRICES BETWEEN 10 AND 70=========");
        for (double price10to70 : prices){
            if (price10to70 >= 10 && price10to70 <= 70){
                System.out.print(price10to70 + " ,");
            }
        }

        System.out.println("\n========== COUNT OF PRICES WHICH ARE MORE THAN 50 ==========");
        int count = 0;
        for (double priceMore50 : prices){
            if (priceMore50 > 50)
            count ++;
        }
        System.out.println("Count of prices more than 50: " + count);

        System.out.println("====Countries with name length more than 7======");

        for (String countriesMoreThan7 : countries) {
            if (countriesMoreThan7.length() >= 7){
                System.out.print(countriesMoreThan7 + " ,");
            }
        }
    }
}
