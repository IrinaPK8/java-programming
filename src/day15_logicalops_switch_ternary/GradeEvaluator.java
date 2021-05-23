package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main (String [] args){

        char grade = 'A';
                // ADDING MORE CONDITIONS, Ex: lower case a b c .....
        if ((grade == 'A' || grade == 'a') || (grade == 'B' || grade =='b') || (grade == 'C' || grade == 'c')){
                // for each one you have to print "grade"
                // adding () makes code more readable but it is not necessary
            System.out.println("Pass with grade " + grade);
        }else if (grade == 'D' || grade == 'd'){
            System.out.println("Qualify for retake with grade " + grade ) ;
        }else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail with grade " + grade);
        }else {
            System.out.println("Invalid grade");
        }
    }
}
