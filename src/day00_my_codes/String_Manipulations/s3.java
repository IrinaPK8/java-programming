package day00_my_codes.String_Manipulations;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class s3 {
    public static void main(String[] args) {
        String s = "I will find the lost book";
        String word = "";
        for (int index = s.length() - 1; index <= 0; index--) {
            word += s.charAt(index);
        }
        System.out.println(word);
    }
}
