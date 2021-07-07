package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        // String word = "java";
        String word = null;  //<-- NullPointerException

        try {
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));      //<-- IndexOutOfBoundsException
        }catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled. Check if String has valid value");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong, check if you entered valid index");
        }catch (Throwable t) {                          // parent of all exceptions goes last
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getCause());
        }

    }
}
