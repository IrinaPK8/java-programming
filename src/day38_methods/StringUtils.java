package day38_methods;

public class StringUtils {
    public static void main(String[] args) {

        System.out.println(isNullOrEmpty("hello"));  // false

        String word = null;
        System.out.println(isNullOrEmpty(word));  // true

        word = "";
        System.out.println(isNullOrEmpty(word));  // true
    }
     /**
      * Parameter: String str
      * returns boolean
      * true --> str is null or empty""
      *     otherwise false
      */
    public static boolean isNullOrEmpty (String str){
        // return (str.isEmpty() || str == null); --> can do condition like this

        if (str == null || str.isEmpty()){
            return true;
        }
        return false; // no need for else statement - can return like this
    }

    public static boolean isPalindrome (String str){
        str = str.toLowerCase();  // to lower case to be able to compare even is str is typed in upper and lower case
         for (int i = 0; i < str.length() / 2 ; i++) {
             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                 return false;
                        // if first and last letters do not match --> not a palindrome/false
             }
         }
         return true;
    }

    public static String reverse (String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
                reverse += str.charAt(i);
        }
        return reverse;
    }
}
