package day00_my_codes.Ternary;

public class Sport {
    public static void main(String[] args) {
        /** [Sport]
         Given a sport you play at the community center you will have to pay some entrance fee.
         Soccer or Tennis fee is: 100
         Otherwise fee is: 50 */

        String sport = "tennis";        // soccer, swimming

        /* if (sport.equals ("tennis") || sport.equals ("soccer")){
            System.out.println ("Fee is 100");
        }else {
            System.out.println ("Fee is 50");
        } */

        String fee = (sport.equals ("tennis") || sport.equals("soccer")) ? "Fee is 100" : "Fee is 50";
        System.out.println(fee);
    }
}
