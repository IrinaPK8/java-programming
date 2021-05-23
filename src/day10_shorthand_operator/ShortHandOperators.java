package day10_shorthand_operator;

public class ShortHandOperators {
    public static void main (String [] args){
        int cars = 10;
        System.out.println("Cars in parking lot: " + cars);
        cars = cars + 2;
        System.out.println("Cars in parking lot: " + cars);
        cars += 5;
        System.out.println("Cars in parking lot: " + cars);
        cars -= 6;
        System.out.println("Cars in parking lot: " + cars);
        cars -= 1;
        System.out.println("Cars in parking lot: " + cars);
        int electricCars = 13;

        cars += electricCars;
        System.out.println("Cars in parking lot: " + cars);

        String word = "Java";
        System.out.println("word is " + word);
        word += " programming";
        System.out.println("word is " + word);
        word += " is fun";
        System.out.println("word is " + word);
        String selenium = " but selenium is more fun";
        word += selenium;
        System.out.println("word is " + word);
        word += 12345;
        System.out.println("word is " + word);

        char letter = 'A';
        letter+= 3;
        System.out.println("letter " + letter);
                // add J to letter
        letter += 1;
        System.out.println("letter " + letter);
        letter += 1;
        System.out.println("letter " + letter);
        letter += 1;
        System.out.println("letter " + letter);
        letter += 1;
        System.out.println("letter " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee is :" + parkingFee);
                // early bird fee is 50% off
        parkingFee /= 2;
        System.out.println("early bird parking fee is :" + parkingFee);
                // weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee is : " +parkingFee);
    }
}
