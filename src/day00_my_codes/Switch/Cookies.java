package day00_my_codes.Switch;

public class Cookies {
    public static void main(String[] args) {

        int cookies = 10;

        String day = "tuesday";
        switch (day) {
            case "sunday":
            cookies++;
            case "monday":
            cookies += 5;
            break;
            case "tuesday":   // code goes right to this line because day = "tuesday"
                              // nothing is added to int because there is no action specified for cookies --> int = 10
            case "wednesday": // code goes here because there is no break after "tuesday"
            cookies+= 10;     // int was 10, here we add 10 --> int = 20 now
            case "thursday":  // code goes here because there is no break after "wednesday"
            cookies += 5;     // int was 20, here we add 5 --> int = 25 now
                break;        // break exits loop -- RESULT int = 25
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies =0;
        }
        System.out.println(cookies);
    }
}
