package OfficeHour.Practice_03_03_2021;

public class ConcatExample {

    public static void main (String [] args){

        System.out.println ("1" + "2" + "3");   //123
        System.out.println (1 + 2 + 3);         //6
        System.out.println(1+2+"3");            //33
        System.out.println("1" + 2 + 3);        //123 because String at the beginning makes everything String
        System.out.println("1" + (2 + 3));      //15 because addition in () is to be done first

    }
}
