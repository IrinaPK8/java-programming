package day00_my_codes.For_Each_Loop;

public class BookValue {
    public static void main(String[] args) {
        /** [Book Value] Given a String book with all the text of your book.
         * Figure out how much you will make from your book.Each chapter you have in your
         * book will add 10 $ value to your book. Go through your book and figure out the value of the book.
         * Ignore case sensitivity.
         Sample Book TextJava textbook By Murodil.
         Chapter 1 datatypes and variables.
         Chapter 2 conditional statements.
         chapter 3 String manipulation.
         Chapter 4 Loops.
         Chapter 5 Arrays.
         Chapter 6 Methods.
         chapter 7 ArrayList.
         chapter 8 instance and static.
         Chapter 9 Constructors.
         Chapter 10 Encapsulation and Inheritance.
         Chapter 11 Abstraction and Polymorphism.
         Chapter 12 Exceptions.
         Chapter 13 Collections.
         Chapter 14 Learn more.14
         Chapters -> value of the book: 140
         */

        int [] chapters = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int price = 0;
        for (int each : chapters){
            price += 10;
        }
        System.out.println("Total book price is $" + price);

    }
}
