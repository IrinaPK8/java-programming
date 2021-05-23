package day21_string_manipulation;

public class firstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last){
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letter mismatch");
        }

        if(word.charAt(0) == word.charAt(2)){
            System.out.println("first and last letter match");
        }

        String anotherWord = "Irina";
        char firstLetter = anotherWord.charAt(0);
        char lastLetter = anotherWord.charAt(anotherWord.length() -1);  // length will count letters and - 1 to indicate the last letter index
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        if (firstLetter == lastLetter){
            System.out.println(anotherWord + " - first and last letters match");
        }else {
            System.out.println(anotherWord + " - first and last letters mismatch");
        }
    }
}
