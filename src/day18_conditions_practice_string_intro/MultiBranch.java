package day18_conditions_practice_string_intro;

public class MultiBranch {
    public static void main(String[] args) {
        int number =5;

        /* number is more than 0 - print 5 is positive
        number is less than 0 - print number is negative
        number equals 0 - print number is 0
         */
        if(number > 0){
            System.out.println(number + " is positive");
        } else if (number <0 ){
            System.out.println(number + " is negative");
        }else{
            System.out.println(number + " is 0");
        }



    }
}
