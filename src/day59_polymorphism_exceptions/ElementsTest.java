package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {

        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        // POLYMORPHISM
        WebElement loginLink = new Link(); //access methods from WebElement only
        loginLink.click(); // takes to link class through WebElement (<-- WebElem methods only)
        String txt = loginLink.getText();
        System.out.println(":txt = " + txt);
        // loginLink.getLinkHref(); // cannot do, can access WebElement


    }
}
