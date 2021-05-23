package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {

        int score = 93;
        String result = (score >60) ? "pass" : "fail";
        System.out.println(result);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println(x);

        System.out.println((score > 90) ? 'A' : 'B');   // will check condition as previous ones, but shorter to write

        System.out.println((score %2 ==0) ? "even" : "odd");   // will check condition as previous ones, but shorter to write
    }
}
