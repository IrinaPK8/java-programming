package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("let's create exceptions");

       /* RuntimeException e = new RuntimeException();
        throw e; */

        /* same in one statement below
        throw new RuntimeException(); */

        String userName = "";
        if (userName.isEmpty()){
            throw new RuntimeException();
        }
    }
}
