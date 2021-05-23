package OfficeHour.Practice_03_31_21;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";

        int count = 0;

        while (str.contains ("java")){
            count++;
            str = str.replace("java", "");
        }





    }
}
