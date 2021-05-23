package day19_class_vs_object_string;

public class StringLenght {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());        // space is counted too
        String name = "Irina";
        System.out.println("Name " + name + " has " + name.length() + " letters");

        int count = name.length();                  // can store word in another container/ variable
        System.out.println("count =  " + count);


        /** IF STATEMENT:
         * when password is at least 6 characters
         * print:valid amazon password
         * else
         * print: password too short
         */

        String password = "Hello";

        if (password.length() >= 6){
            System.out.println("valid amazon password");
        }else {
            System.out.println("password must be at least 6 characters");



        }
    }
}
