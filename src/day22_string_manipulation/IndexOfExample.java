package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf(","));  // find first comma - 4
        System.out.println(technologies.lastIndexOf(","));   // find last comma - 40
        System.out.println(technologies.lastIndexOf("java"));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);  //0 - shows where it starts

        int idxOfCss = technologies.indexOf("css");
        System.out.println("CSS is at index " + idxOfCss);  // shows where it starts

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + idxOfCucumber);    // 42

        int idxOfSql = technologies.indexOf("sql");
        System.out.println("CSS is at index " + idxOfSql);  // -1 if it cannot find

        //TECHNOLOGIES CONTAIN MAVEN

        if (technologies.contains("maven")){
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven" ) > -1){
            // means when indexOf cannot find smth, it prints out -1. Maven is present, it has certain index, which is > -1
            // WHATEVER INDEXES ARE PRESENT WILL ALWAYS HAVE INT 0 OR MORE
            System.out.println("maven is found");
        }else{
            System.out.println("maven is not present");

            String word = "hello";
            System.out.println(word.indexOf("el"));     // returns 1 because returns where it starts only, not the entire letter combo

           /* if (word.indexOf("el") > -1){
                    ..........
            }else {
                    ..........
            } */
        }


    }
}
