package day00_my_codes.Arrays;

import org.omg.CosNaming.BindingIterator;

public class Colors {

    public static void main(String[] args) {
        String[] colors = {"red", "green", "orange", "blue"};

        for (int i = 0; i < colors.length; i++) { // this loop goes over array length
            String color = colors[i];
            if (colors[i].length() <= 4) {      // this loop goes over each word length
                System.out.println(color);
            }
        }
    }
}
