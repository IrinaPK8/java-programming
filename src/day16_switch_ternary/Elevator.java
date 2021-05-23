package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 5;
                /* floorNum = 1 --> "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
                    floorNum = 2 --> "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
                    floorNum = 3 --> "Floor 3 selected. Companies: :yft, Bofa, Steak house"
                    anything else --> invalid floor
                 */
        if (floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum == 3){
            System.out.println("Floor 3 selected. Companies: :yft, Bofa, Steak house");
        }else{
            System.out.println("Invalid floor");
        }

        System.out.println("======SWITCH======");
                        // switch goes automatically to matching case instead of checking line by line top to bottom as in if statement
        floorNum = 2;                   // declare variable
        switch (floorNum) {              // do not put condition to ()
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;                  // break exists switch
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, Bofa, Steak house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }
    }
}