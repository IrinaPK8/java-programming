package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.indexOf("j"));      /* to search for j in java. Once it is found,
                                                        it will return the index of j - its position - 0*/
        System.out.println(word.indexOf("v"));      //2
        System.out.println(word.indexOf("ja"));     // 0 - returns firs letter only
        System.out.println(word.indexOf("x"));      // -1 because letter is not found
    }
}
