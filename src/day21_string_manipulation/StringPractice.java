package day21_string_manipulation;

public class StringPractice {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace ("hub", "lab"));
        System.out.println("word = " + word);

       /** word = "git";
        word = word.replace ("hub", "lab");   // if java does not find what to replace, no action will happen
        System.out.println(word); */

        word = word.replace("hub", "lab");
        System.out.println("word = " + word);

        System.out.println(word.replace('i', 'o'));     // replace in a short way and with chars
        System.out.println(word.replace('i', 'o').replace('g', 'h'));   // can replace multiple at the same time

        String sentence = "java is fun";
        String noSpaceSentence = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + noSpaceSentence);

        System.out.println("sentence: " + sentence.replace("java", "selenium").replace("fun", "a lot of fun").replace(" ", ""));

        /*   TO MAKE CODE BETTER READABLE WE CAN BREAK IT TO MULTIPLE LINES
             System.out.println("sentence: " + sentence.replace("java", "selenium")
                                                       .replace("fun", "a lot of fun")
                                                       .replace(" ", ""));
         */

        String result = "1-48 of over 4,000 result for java book";
        result = result.replace ("1-48 of over ", "").replace(",", "").replace(" result for java book", "");
        System.out.println(result);

        int count = Integer.parseInt(result);
        ++count;
        System.out.println(count);
    }
}
