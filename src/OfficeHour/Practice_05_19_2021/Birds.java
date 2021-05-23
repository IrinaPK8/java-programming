package OfficeHour.Practice_05_19_2021;

public class Birds {

    // ENCAPSULATION

    private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        // this.beakLength = beakLength;
        if (beakLength < 0){
            System.out.println("Invalid length");
        }
    }
}
