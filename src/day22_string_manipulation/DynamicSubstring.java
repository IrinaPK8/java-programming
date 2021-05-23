package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
          //  SUBSTRING + INDEXOF //
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));       // prints 12345 only
        System.out.println(result.substring(13));           // prints 12345 only

                // find the index of :
        System.out.println(result.indexOf(":"));            // find index of :      --> 12
        int columnIndex = result.indexOf(":");              // store index of : in int = 12
        System.out.println(result.substring(columnIndex +1)); // +1 means not to start printing from :, but from the next character --> 12345

        // COMBINING THEM INTO ONE STATEMENT
        System.out.println(result.substring(result.indexOf(":") + 1));       // 12345


        /** find index [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         */
        // DYNAMIC CODE
        String today = "I learned [cucumber] today";
        System.out.println(today.substring((today.indexOf ("[") +1), (today.indexOf("]"))));

        /* OR WITH VARIABLES
        int today = today.indexOf("[");
        int ens = today.indexOf("]");
        System.out.println(today.substring(start +1, end);
         */

    }
}
