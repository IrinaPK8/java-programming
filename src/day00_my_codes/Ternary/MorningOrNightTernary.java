package day00_my_codes.Ternary;

public class MorningOrNightTernary {
    public static void main(String[] args) {
        /** [Morning or Night]
         Given some time value (int) in 24 hours format. Print if it's the morning or night.
         0 - 11 : Morning             12- 24 : Night
         -> You can assume the value given is always valid (in the 24 hours range),
         but if you want a challenge use an if to control invalid values */

        int time = 9;
        String morningOrNight = (time >0 && time < 11) ? "Morning" : "Night";
        System.out.println(morningOrNight);

    }
}
