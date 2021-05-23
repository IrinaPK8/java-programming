package day19_class_vs_object_string;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {


        String word = "intellij idea";
        System.out.println(word.startsWith("i"));                       // true
        System.out.println(word.startsWith("in"));                      // true
        System.out.println(word.startsWith("intellij idea"));           // true
        System.out.println("java".startsWith("j"));                     // true
        System.out.println(word.startsWith("Int"));                     // false, because case sensitive

        System.out.println(word.endsWith("idea"));                      // true
        System.out.println(word.endsWith("a"));                         // true

        String name = "Irina";
        if (name.endsWith("a")){
            System.out.println("it is a female name");
        }

        String firstName = "Dr Klein";
        if (firstName.startsWith("Dr")) {
            System.out.println("it means doctor");
        }else if (firstName.startsWith("Mr")){
            System.out.println("it means mister");
        }else if (firstName.startsWith("Mrs")) {
            System.out.println("it means misses");
        }else if (firstName.startsWith ("Sr")){
            System.out.println("it means senior");
        }else if (firstName.startsWith("Ms")){
            System.out.println("it means miss");
        }

     String url = "ccbc.edu";
        if (url.endsWith(".com")){
             System.out.println("commercial website");
         }else if (url.endsWith(".ru")){
            System.out.println("russian website");
         }else if (url.endsWith(".gov")) {
            System.out.println("government website");
        } else if (url.endsWith (".edu")){
             System.out.println("educational website");
         }else if (url.endsWith (".org")){
       System.out.println("organization website");}

    }
}
