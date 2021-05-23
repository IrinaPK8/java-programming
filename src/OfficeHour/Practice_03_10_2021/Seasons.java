    package OfficeHour.Practice_03_10_2021;
    import java.util.Scanner;
    public class Seasons {
        public static void main (String [] args){
        /*
        The seasons will determine how long each day and night are.
        The season will be determined by a number:
    > 1 - Spring
    day: 14
    night: 10
    > 2 - Summer
    day: 16
    night: 8
    > 3- Fall
    day: 14
    night: 10
    > 4 - Winter
    day: 12
    night: 12
         */
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter season number: \n1 - Spring\n2 - Summer\n3 - Fall\n4 - Winter");
            int season = scan.nextInt();
            int day = 0;                    // assigning 0 by default
            int night = 0;                  // assigning 0 by default
            String seasonName = "";         // empty string by default

            if (season ==1){
                day = 14;
                night = 10;
                seasonName = "Spring";
            }

            if (season ==2){
                day = 16;
                night = 8;
                seasonName = "Summer";
            }

            if (season ==3){
                day = 14;
                night = 10;
                seasonName = "Fall";
            }

            if (season ==4){
                day = 12;
                night = 12;
                seasonName = "Winter";
            }
            System.out.println("In " + seasonName + " there are " + day + " day hrs and " + night + " night hrs");
        }
    }
