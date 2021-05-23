package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        String total = "345";
        int count = Integer.parseInt(total);    // convert String to int
        System.out.println(count);              // now count is a number 345, not String anymore

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if (price > 100) {
            System.out.println("expensive");
        }

            // extract 100 from a string
        String sentence = "I wrote 100 lines of java code";
        String [] words = sentence.split(" ");          // first split
        int  linesOfCode = Integer.parseInt(words[2]);
                    // 100 is under index 2 now as String --> need to parse this String to int index [2] --> 100
        System.out.println(linesOfCode);

    }
}
