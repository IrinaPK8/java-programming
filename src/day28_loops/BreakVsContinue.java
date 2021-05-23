package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {

        // CONTINUE --> SKIP
        // BREAK --> STOP
        for (int n = 1; n <= 5; n++) {
            System.out.print(n);
            if (n == 3) {                   // break/stop when i reaches 3
                break;
            }
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {         // 135 - we are skipping 2 and 4
                continue;
            }
            System.out.print(i);

        }
    }
}
