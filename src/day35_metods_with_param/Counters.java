package day35_metods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        int num = 99;
        count(num);
        String word = "wooden spoon";
        count(word.length());           // will count to 12
        count(word.indexOf("d"));       // 1 2 3
        printAge (1983);
    }
    public static void count (int num){
        // it prints from 0 to that num in same line --e. g., count (5) --> 1 2 3 4 5
        for (int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year: " + year + ". Age: " + age);
    }
}
