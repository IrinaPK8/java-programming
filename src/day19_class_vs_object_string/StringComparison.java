package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Chicago";

            //EQUALS()
        System.out.println(city.equals ("Chicago"));    // true
        System.out.println(city.equals("chicago"));     // false - case sensitive
        System.out.println(city.equals("Chicago "));    // false - due to space at the end

        //EQUALSIGNORECASE()
        System.out.println(city.equalsIgnoreCase("Chicago"));       // true
        System.out.println(city.equalsIgnoreCase("chicago"));       //true - not case sensitive
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));       // true
        System.out.println(city.equalsIgnoreCase("Chiicago"));      // false
        System.out.println(city.equalsIgnoreCase("Chi cago"));      // false - one character is mismatching
        System.out.println(city.equalsIgnoreCase ("Boston"));       // false

        if (city.equals ("CHICAGO")){       // false - because case sensitive
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (city.equalsIgnoreCase("CHICAGO")){      //true because case insensitive
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }
}
