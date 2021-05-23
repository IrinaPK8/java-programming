package day00_my_codes.If_Else_Loop;

public class Months {
    public static void main(String[] args) {
        /*Write a program that will accept a number representing the month. Print out how many days are in that given month.
        Assume February (2) has 28 days
        Ex:
        Input: 1
        Output: 31 days

        Input: 2
        Output: 28 days*/

        int month = 2;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println ("31 days");
        }else if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println ("30 days");
        }else if (month == 2){
            System.out.println("28 days");
        }else {
            System.out.println("Invalid month");
        }

    }
}
