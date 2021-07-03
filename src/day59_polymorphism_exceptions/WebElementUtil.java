package day59_polymorphism_exceptions;

public class WebElementUtil {
    //METHOD WITH POLYMORPHIC PARAMETER
    // element accepts any child class object  like Link, InputField etc.
    // clickElement.(new Link());  clickElement(new InputField()); <-- can do this

    public static void clickElement(WebElement element) {
        // static so we do not have to create object
        System.out.println("Clicking on Element");
        element.click();
    }

    public static WebElement getLinkWithText (String txt){
        System.out.println("Searching for a link with text = " + txt);
        return new Link();
    }
}



