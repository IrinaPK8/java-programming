package day50_inheritance;
/** RUNNER CLASS */
public class BookObjects {
    public static void main(String[] args) {
     // creating object for each book type, assigning values
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium Cookbook";
        audioBook.type = "Automation";
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java Data Structures";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.price = 85.0;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();
    }
}
