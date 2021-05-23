package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char each : letters) {
            System.out.print(each + " "); //j a v a   i s   f u n
        }
        System.out.println();

        /** When we have char array, we can create a String out of it. It will automatically join all characters in String */
        String sentence = new String(letters);
        System.out.println("Sentence: " + sentence); //Sentence: java is fun

        /** Convert String into char array */
        String item = "Wooden Spoon";
        char[] itemArray = item.toCharArray();              // store in a char variable
        System.out.println("itemArray.length = " + itemArray.length); //itemArray.length = 12
        System.out.println("item.length() = " + item.length());   //item.length() = 12

        String [] fruits = {"bananas", "apples", "kiwi", "mangoes", "papaya", "strawberry"};
              // indexes       0           1       2         3         4           5

        System.out.println(fruits [0] + "-" + fruits [1] + "-"+ fruits [2] + "-"+ fruits [3] + "-"+ fruits [4] + "-"+ fruits [5]);
                                    // bananas-apples-kiwi-mangoes-papaya-strawberry

        /** ANOTHER WAY - WITH LOOP */
        String fruitStr = "";

        for (String each : fruits) {

            fruitStr += each + "-"; // putting everything in fruitStr container OR can type like this --> System.out.print(each + "-");
        }
        System.out.println("FruitStr = " + fruitStr); //FruitStr = bananas-apples-kiwi-mangoes-papaya-strawberry-

        /** SHORTER WAY */
        String [] languages = {"java", "python", "C++", "SQL", "Ruby", "JavaScript"};
        String.join(" | ", languages);  // "|" - limiter --> what is in between the words --> can be anything
        String joinedLanguages = String.join (" <> ", languages);
        System.out.println("joinedLanguages = " + joinedLanguages); // joinedLanguages = java <> python <> C++ <> SQL <> Ruby <> JavaScript
    }
}
