package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {

        // we can check if String value equals to other value. We cannot
        // compare with < > <= >==
        // ways to compare: 1 - using == operator;  2 - using equals () method/function

        String city = "Omsk";
        if(city.equals ("Fairfax")){
            System.out.println("It is Fairfax");
        }else{
            System.out.println("It is not Fairfax");
        }
        System.out.println("====================");

        String weather = "rainy";
        if(weather.equals ("sunny")){
            System.out.println("Let's go out");
        }else{
            System.out.println("Let's stay indoors");
        }
    }
}
