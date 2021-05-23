package day20_String_manipulation;
import java.util.Scanner;   /** it is in grey color, because this import package is not used here */

/**
import java.lang.*; - this import statement is automatically
 added by compiler to each class. No need to do it manually */

public class StringCreationMethods {
    public static void main(String[] args) {

        String word1 = "potato";                        // one way of creating String
        String word2 = new String ("tomato");           // another way to create String
        String word3 = "";                              // empty String object
        String word4 = new String ();                   // empty String object
        System.out.println("word1 is " + word1);
        System.out.println("word2 is " + word2);

        // IF YOU TYPE "java" --> dot --> sout --> enter - it will print automatically System.out.println("java");
        System.out.println("java");

    }
}
