package day37_methods_overloading;

public class GetDayName {

    public static void main(String[] args) {
        System.out.println(getDayName(7));
        System.out.println(getDayName(4));
        System.out.println(getDayName(8));

        for (int i = 1; i <=8; i++){
            System.out.println(i + " = " + getDayName(i));
        }
        // store value into variable and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if (someDay == null) {
            System.out.println("someDay is null for invalid entry");
        }
        System.out.println(getDayNameV2(2));
    }
    public static String getDayName (int day){
        // using switch statement
        switch(day){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("ERROR: Invalid day - " +  day);
                return null;//nothing, no object
            }
        }

        public static String getDayNameV2 (int day){
        String dayName;    // declaring variable
        switch (day){       // based on day number we are assigning
            case 1 : dayName = "Monday"; break;
            case 2 : dayName = "Tuesday"; break;
            case 3 : dayName = "Wednesday"; break;
            case 4 : dayName = "Thursday"; break;
            case 5 : dayName = "Friday"; break;
            case 6 : dayName = "Saturday"; break;
            case 7 : dayName = "Sunday"; break;
            default: System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;  // we use return because break only exits switch
                         // return is necessary for custom method
        }
    }
