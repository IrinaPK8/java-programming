package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        // WITH MAIN METHOD --> need a static variable
        printNums(1);


    }

    public static void printNums(int num){
        System.out.print(num + " ");
        num++;
        if (num <= 100) { // condition to stop loop at 100 (just not to have error)
            printNums(num);
        }

    }

}
