package day05_Primitives_concatanation;

public class CellPhone {
    public static void main (String [] args){
       String brand = "Samsung";
       String model = "S22 plus";
       String color = "blue";
       double price = 799.99;
       short storage = 128; // or we can stick to int - most popular one
       boolean hasCamera = true;

       System.out.println (brand);
       System.out.println (model);
       System.out.println (color);
       System.out.println (price);
       System.out.println (storage);
       System.out.println (hasCamera);
       System.out.println ("====================");

       //USING  CONCATENATION

        System.out.println ("The Brand is " + brand);
        System.out.println ("Model is " + model);
        System.out.println ("Color is " + color);
        System.out.println ("Price is $ " + price);
        System.out.println ("Storage size is " + storage +" GB");
        System.out.println ("Has Camera? - " + hasCamera);


    }
}
