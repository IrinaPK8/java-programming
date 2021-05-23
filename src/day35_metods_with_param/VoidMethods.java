package day35_metods_with_param;

public class VoidMethods {
    public static void main(String[] args) {

        printAtoZ();

        for (int i = 0; i < 10; i++) {       // this loop in main method prints all alphabet 10 times from custom method
            printAtoZ();
        }
        System.out.println();

        USflag();
        USflag();
    }

    public static void printAtoZ() {  //this custom method prints all alphabet once

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void USflag() {  //this custom method prints all alphabet once

        /** print US flag */
        System.out.println(" ***** FLAG OF USA *****");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }

}
