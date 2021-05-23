package day00_my_codes.If_Else_Loop;
public class IfElse {
    public static void main (String [] args){

        int books = 5;
        if(books<10){
            // books = books + 10;
            books += 10;
        }
        System.out.println (books); 	//15


        boolean hot = true;
        if(hot == true){
            System.out.println ("Can I have some ice?");
        }

        boolean isWeatherNice = false;
        if (isWeatherNice) {
            System.out.println ("Let's go swimming");
        }else{
            System.out.println ("Stay home\nWatch movie") ;
        }

    }
}
