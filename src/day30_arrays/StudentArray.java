package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5];      // this array will hold 5 values    // [] shows java that it is array
        student1[0] = "12345";
        student1[1] = "Irina";
        student1[2] = "Kulik";
        student1[3] = "B22";
        student1[4] = "443-123-4567";          /**this way is good when you know how many
                                            values will there be: assign first, then declare */

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 phone = " + student1[4]);

        System.out.println("student1 data length: " + student1.length);     // counts how many indexes are in String, returns int

                            /** check if student1 data array contains 5 items:
                             * true --> "PASS: data array has correct length";
                             * false --> "FAIL: data array has incorrect length" */

        if (student1.length == 5) {                 // use == instead of .equals because we compare int, not String
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        System.out.println();

        // ANOTHER WAY TO DECLARE ARRAY
        String[] student2 = {"12345", "Irina", "Kulik", "B22", "443-123-4567"};
                            //   0        1        2       3         4          --> indexes
                            /**this way is good when you do not know how many
                             values will there be: first declare array, then assign as many as needed*/

        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 first name = " + student2[1]);
        System.out.println("student2 last name = " + student2[2]);
        System.out.println("student2 batch number = " + student2[3]);
        System.out.println("student2 phone = " + student2[4]);

        if (student1.length == student2.length) {           // use == instead of .equals because we compare int, not String
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }
        System.out.println(student2[1].toUpperCase() + " " + student2[2].toUpperCase());
                        // student2[1] - this will give String, so we can use any String manipulation to it

        String mobileNum = student1[4];         // read mobile from array and store into variable
        System.out.println(mobileNum);
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));


    }
}
