package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "Anna";
        System.out.println(word.charAt(3) + "" + word.charAt(2) +"" + word.charAt(1) +"" + word.charAt(0));
        String word2 = word.charAt(3) + "" + word.charAt(2) +"" + word.charAt(1) +"" + word.charAt(0);
                        // assigning to another variable
        System.out.println("word = " + word);
        System.out.println("word2 - reverse = " + word2);

        if (word.equalsIgnoreCase(word2)){
            System.out.println("palindrome word");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
