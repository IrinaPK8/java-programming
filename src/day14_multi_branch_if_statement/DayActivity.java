package day14_multi_branch_if_statement;
public class DayActivity {
    public static void main(String[] args) {
       String weather = "windy";
       if (weather == "sunny"){
           System.out.println("Go to park");
       }else if(weather == "rainy"){
           System.out.println("stay home, have tea");
       }else if(weather == "snowy"){
           System.out.println("Make a snowman");
       }else if(weather == "windy"){
           System.out.println("Fly a kite");
       }else {
           System.out.println("Keep coding Java");
       }
    }
}
