package day51_inheritance_overriding.super_keyword;

public class LyftLux extends Lyft{

    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) * 1.2;
    }
}
