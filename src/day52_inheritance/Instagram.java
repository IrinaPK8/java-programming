package day52_inheritance;

public class Instagram extends MobileApp{
public void postPhoto(){
    System.out.println("Posting photo on Instagram");
}
// OVERRIDING
// 1) same name and params as in parent class)
// 2) access modifier should be same or more visible
    // public --> public
    // protected --> protected or public
    // default --> default or protected or public
    // private --> not inherited, not going to be overridden!!!!
//3) return type must be the same or sometimes subclass
   // version - covariant (if there is a subclass)

    @Override
    public void useTheApp (int minutes){
    super.useTheApp(minutes);
        System.out.println("Using Instagram app features for "
                + minutes + " minutes");
        postPhoto();
    }
}
