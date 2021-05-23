package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
                 // index    0          1        2         3        4            5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad",  "iphone 12 case" };
        double[] prices = { 99.99,    150.0,   9.99,      250.0 ,  439.50,     39.99};
        int[] itemIDs =   { 12345 ,   12346,   12347,     12348,   12349,      12350};

        System.out.println("--------FIND THE INDEX OF GLOVES IN ITEM ARRAY--------");
                                // use for loop with condition
        for (int i = 0; i< items.length; i++){
            if (items[i].equals("Gloves")){
                System.out.println("Gloves found at index " + i);
                break;              /* without break loop will be checking items even
                                     after Gloves are found. After break it will stop */
            }
        }
        System.out.println();
        System.out.println("-------- SET BOOLEAN TO TRUE IF IPAD IS FOUND--------");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPad Exists = " + iPadExists);
        if(iPadExists) {
            System.out.println("We bought the iPad!!");
        } else {
            System.out.println("We forgot the iPad! :(");
        }

        System.out.println();
        for (int i = 0; i < items.length; i++){
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
        System.out.println();
        System.out.println("------ LOOK FOR JACKET and print all details -----");

        for (int i = 0; i < items.length; i++){
            if (items[i].equals("Jacket")){
                System.out.println(items[i] + " - $" + prices [i] + " - #" + itemIDs[i]);
                break;
            }
        }
        System.out.println();
        System.out.println("------- FIND AIRPODS and all details");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals ("Airpods")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }
        System.out.println();
        System.out.println("------FIND iphone 12 case and all details------");
        for (int i = 0; i < items.length; i++){
            if (items[i].equals("iphone 12 case")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            }
        }
        System.out.println();
        System.out.println("------FIND SHOES and all details------");
        for (int i = 0; i < items.length; i++){
            if (items[i].equals("Shoes")){
                System.out.println(items[i] + " - $" + prices [i] + " - $" + itemIDs[i]);
            }
        }
        }
    }
