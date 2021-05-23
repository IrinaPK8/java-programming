package day00_my_codes.Switch;

public class FieldTrip {
    public static void main(String[] args) {
        /* Your school goes on a Field trip each year. The place you go will be based on your grade.
        Given some grade number (1-6) figure out the details of your field trip. Print the information at the end */

        int grade = 6;
        String location = " "; //Apple orchard, Zoom, Aquarium, Movie Theatre, Museum, Six Flags
        int numOfGroups = 0;
        String teacherInCharge = " ";

        switch (grade){
            case 1:
                location = "Apple orchard";
                numOfGroups = 3;
                teacherInCharge = "Ms. Smith";
                break;

            case 2:
                location = "Zoo";
                numOfGroups = 7;
                teacherInCharge = "Mr. Lee";
                break;

            case 3:
                location = "Aquarium";
                numOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
                break;

            case 4:
                location = "Movie theater";
                numOfGroups = 2;
                teacherInCharge = "Ms. Reyes";
                break;

            case 5:
                location = "Museum";
                numOfGroups = 5;
                teacherInCharge = "Ms. Lela";
                break;

            case 6:
                location = "Six Flags";
                numOfGroups = 8;
                teacherInCharge = "Mr. Watt";
                break;

            default: System.out.println ("Invalid number of grade");
        }
        System.out.println ("Grade " + grade + " will go to " + location + " with the teacher " + teacherInCharge + ". Total number of groups is " + numOfGroups);

    }
}
