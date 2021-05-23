package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {

        checkEligible(800);
           // System.out.println(checkEligible(600)); - ERROR - cannot print void method

        System.out.println();
        System.out.println("Score is " + getCreditScore());
        int score = getCreditScore();           // can be assined to variable and then print it out
        System.out.println("Score is " + score);

    }
    public static void checkEligible (int creditScore){
        if (creditScore >= 700){
            System.out.println("You are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore() {
        return 800;         // whatever we type after return --> this value will be printed
    }
}
