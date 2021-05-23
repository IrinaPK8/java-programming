package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("* * * * * Starting Etsy Search Smoke Test * * * * *");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
    }
    public static void openBrowser() {
        System.out.println("Launch your browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("Type in etsy.com and navigate to Etsy");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("Type Wooden Spoon in search line");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("Choose the wooden spoon you'd like to purchase");
    }
}
