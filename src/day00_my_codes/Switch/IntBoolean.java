package day00_my_codes.Switch;

public class IntBoolean {
    public static void main(String[] args) {

        int num = 2;
        boolean b = true;

        switch (num) {
            case 0:
                b = false;
            case 1:
                System.out.println(1);
            case 2:                             // code starts here because num = 2
                if (b) {                        // true, because boolean b is true
                    System.out.println(2);      // PRINTING 2
                } else {
                    b = false;
                }
            case 3:                             // code goes here because there is no break in case 2
                if (b) {                        // condition in () is true because boolean b is true
                    System.out.println(3);      // PRINTING 3
                    b = false;                  // b becomes false
                } else {
                    break;
                }
            case 4:                             // code goes here because there is no break in case 3
                System.out.println(4);          // PRINTING 4
            case 5:                             // code goes here because there is no break in case 4
                if (!b) {                       // condition in () is true because b is false now
                    break;                      // break exits the loop
                }
                System.out.println(5); // <-- code will not go here because loop exits above
        }
                // PRINT 234
    }
}
