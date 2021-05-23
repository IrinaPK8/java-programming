package day00_my_codes.Ternary;

public class GardenPatio {
    public static void main(String[] args) {
        String result = 3425 > (9 * 1000) ? "garden" : "patio";
               // condition--> is 3425 more than 9000 --> no --> "patio" will be chosen
        result.substring(2);
               // as long as it is not assigned like this --> result = result.substring(2), THIS LINE WILL NOT WORK
        System.out.println(result);  // patio
    }
}
