package OfficeHour.Practice_03_31_21;

public class CountsUpperLowerOrNumber {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase = 0, number = 0;

        for (int i = 0; i < str.length(); i++){
            char eachLetter = str.charAt(i);  // variable will have value of i - whatever i is when going along the str
            if (eachLetter >= 'A' && eachLetter <='Z') {
                upperCase++;
            }else if (eachLetter >= 'a' && eachLetter <='z'){
                lowerCase++;
            } else if (eachLetter >= '0' && eachLetter <= '9'){
                number++;
            }
        }
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Number: " + number);

    }
}
