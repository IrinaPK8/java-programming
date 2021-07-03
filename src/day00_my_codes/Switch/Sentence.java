package day00_my_codes.Switch;

public class Sentence {
    public static void main(String[] args) {
        String str = "";
        int num = 20;
        switch(num) {
            case 0:
                str = "C# ";
                break;
            case 10:
                str += "is ";
            case 15:
                str += "fun ";
            case 20:            // code starts here because num = 20
                str += "java ";  // --> str = "java"
                                // no break, so code goes to next line
            case 25:
                str += "is ";    // str = "java is"
                break;          // code stops here --> break exits loop --> RESULT "java is"
            case 30:
                str += "fun ";
                break;
            case 35:
                str += "python";
            case 40:
                str += "90";
        }
        System.out.println(str);
    }
}
