package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalClasses = 0;
        /**loop day = 1 till day30
         every day there are 200 new cases
         every Sunday (day % 7 == 0) there are 500 new cases
         "day 1 - daily cases: 200"
         print total cases */


        int totalCases = 0;
        int day = 0;

        for (day = 1; day <= 30; day++) {
            if (day % 7 == 0) {                //Sundays → more cases
                totalCases += 500;
            } else {
                totalCases += 200;
            }
            System.out.println("Day " + day + " | total cases: " + totalCases);
        }

        System.out.println("Total cases in JavaCity 11/2021 = " + totalCases);


/**System.out.println(“Total cases in JavaCity 11/2021 = “ + totalCases + LocalData.now().getDayOfWeek());
 .LocalData.now(); - adds date to java class
 .getDayOfWeek(); - adds day of week to java class */


    }
}
