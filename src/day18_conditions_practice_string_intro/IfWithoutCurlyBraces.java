package day18_conditions_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if (todaysClass.equals("java"))
            System.out.println("Java is fun");
            // System.out.println("java is fun again"); - you cannot print 2 statements when there are no {}
            // only ONE STATEMENT CAN BE WITHOUT {}
            // ONLY FORST STATEMENT WILL BE PRINTED OUT
        else
            System.out.println("it is " + todaysClass);

        // RECOMMENDED TO USE {} AT ALL TIMES!!!!

                }
            }
