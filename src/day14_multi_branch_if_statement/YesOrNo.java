package day14_multi_branch_if_statement;
public class YesOrNo {
    public static void main (String [] args){
        System.out.println("Are you sure you want to delete this file?");
        boolean variable;
        char selection = 'y';          // if we change letter to n - output will be different
        boolean answer;                // just assigning variable,value will be assigned in the condition, because value will depend on what will be printed out (if or else)
        String result;
        if(selection == 'y') {         // we use ' ' because selection is char variable
            System.out.println("Your file will be deleted");
            answer = true;             // to print out answer to last question if this statement gets printed
            result = "deleted";
        }else {
            System.out.println("File deletion is cancelled");
            answer = false;            // to print out answer to last question if this statement gets printed
            result = "not deleted";
        }
        System.out.println("Did file get deleted? - " + answer);
        System.out.println(result);
    }
}