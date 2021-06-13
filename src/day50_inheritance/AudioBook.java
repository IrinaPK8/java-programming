package day50_inheritance;

public class AudioBook extends Book {
    int length;
    String narrator;

    public void listen () {
        System.out.println("Listening to Audiobook");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println("Narrator = " + narrator);
        System.out.println("Length = " + length);
    }
}
