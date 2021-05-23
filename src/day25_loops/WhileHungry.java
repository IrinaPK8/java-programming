package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        /*
        while hungry, eat banana 1 --> eat 3 to be full, then isHungry is false --> exit loop */
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while (isHungry) {
            bananas++;
            System.out.println("Eating a banana: " + bananas);
            // OR can use ternary -  isHungry = bananas == countToFull ? false : true;
            if (bananas == countToFull) {
                /* when bananas equals countToFull(i.e. 3)
                   --> hungry will be false = not hungry anymore*/
                isHungry = false;
            }
        }
        System.out.println("Had enough, not hungry anymore");       // loop exit
    }
}
