package day52_inheritance;

public class Discord extends MobileApp {
    public void chat(String someone) {
        System.out.println("Chat with " + someone
                + " on Discord");
    }

    /**
     * overload download method --> name stays the same
             * protected boolean download (double version){
             * System.out.println("Downloaded Discord " + version);
             * return true;
             * } */

    /** overriding download method --> same name, return and params, same or wider access modifier */
    @Override
    public boolean download () {
        System.out.println("Download discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Art");
    }

    public void printInfo () {
        System.out.println("App name = " + getName());
        System.out.println("App version = " + getVersion());
    }
}
