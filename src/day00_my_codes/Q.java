package day00_my_codes;
import org.testng.annotations.Test;

import java.util.*;
public class Q {
    String size;
    ArrayList <Pillow> pillows = new ArrayList<>();

    public Q (String size, int numOfPillows) {
        this.size = size;
        for (int i = 0; i < numOfPillows; i++) {
            this.pillows.add(new Pillow());
        }
    }
}
class Pillow {
    String material;

    public static void main(String[] args) {
        Q bed = new Q("king", 4);
        System.out.println(bed.pillows.size());
    }
}


