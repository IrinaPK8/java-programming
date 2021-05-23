package OfficeHour.Practice_03_31_21;

public class CountJava2 {
    public static void main(String[] args) {

        String str = "java is fun. java class today, not javascript";

        int count = 0;

        for (int i = 0; i < str.length() -3; i++){
            String eachFourLetters = str.substring(i , i + 4);
                            // tracking every four characters - 0123, 12345, 2345, 3456, 4567 etc looking for java combination
            if (eachFourLetters.equals("java")){
                count++;
            }

        }

        System.out.println(count);

    }
}
