package day33_arrays;

public class ForLoopWith2Variables {
    public static void main(String[] args) {
        // THIS LOOP GOES FORWARD, BOTH i AND j ARE ++
        for (int i = 1, j = 1; i <= 4; i ++, j ++){
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println();

        //THIS LOOP WILL GO FORWARDS FOR i AND BACKWARDS FOR j
        for (int i = 1, j = 5; j >= 0; i++, j --){
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}

