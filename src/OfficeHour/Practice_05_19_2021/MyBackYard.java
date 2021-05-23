package OfficeHour.Practice_05_19_2021;

import day46_encapsulation.Bird;

public class MyBackYard {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();

        birdOne.setCanFly(true);
        System.out.println("birdTwo.getCanFly(false) = " + birdOne.getCanFly());

        birdTwo.setBeakLength(-1);
        System.out.println("birdTwo.getBeakLength() = " + birdTwo.getBeakLength());




    }
}
