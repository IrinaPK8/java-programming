package day20_String_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentence = "java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a", "u"));
        System.out.println(sentence.replace("strings", "conditions"));
        System.out.println(sentence.replace ("java ", ""));

    }
}
