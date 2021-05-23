package day00_my_codes.Ternary;

public class Jimmy {
    public static void main(String[] args) {

        String name = "Jimmy";
        boolean check;

        if (name == "James") {  // condition is false because Jimmy does not equal James (different names)
            check = false;
        } else {
            check = true;   // this check will be considered further
        }
        String str = check ? "5" : "10";  // check is true so str = "5"
         // System.out.println(str == 10);    // (remove first // to run code) str is String and = "5" --> cannot compare String to int 10
                            // compile error!!!!
    }
}
