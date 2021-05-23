package day00_my_codes.If_Else_Loop;
import java.util.Scanner;
public class Samplecode {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number");
                int number = input.nextInt();

                if(number < 0) {
                    System.out.println("Enter a positive number");
                    number = input.nextInt();
                }else if(number < 50 && number > 0) {
                        number += 2000;
                } else if(number >= 100) {
                    System.out.println("Bigger number, subtracted 50");
                    number -= 50;
                } else {
                    number *= 10;
                }
                System.out.println(number);
            }
        }
