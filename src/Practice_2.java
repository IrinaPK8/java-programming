public class Practice_2 {
    public static void main(String[] args) {

        isPalindrome(1234);

       /* int vr = 1234;
        int temp;
        int newVr = 0;

        temp = vr % 10;  // 4
        newVr = temp * 10 + temp;
        vr /= 10;

        temp = vr % 10;  // 3
        newVr = newVr * 10 + temp; //43
        vr /= 10;

        temp = vr % 10;  // 2
        newVr = newVr * 10 + temp; // 432
        vr /= 10;

        temp = vr % 10;  // 1
        newVr = newVr * 10 + temp;
        vr /= 10;

        System.out.println(newVr);
    }*/
    }
        public static void isPalindrome(int num){

            boolean palin = false;
            int rev = 0;
            int num2 = num;

            while (num2 != 0) {
                rev = rev * 10 + num2 % 10;
                num2 /= 10;
            }

            if (rev == num) {
                palin = true;
            }
            System.out.println(palin);

        }
    }

