package OfficeHour.Practice_03_16_2021;
import java.util.Scanner;
public class BakingContest {
    public static void main(String[] args) {
        /*[Baking contest] You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.
                Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2
        If your score is more than both of the other people then print "First place!"
        If your score is more than one other person then print "Second place"
        If your score is less than both of the other people then print "Third place"*/

        Scanner scan = new Scanner (System.in);
        int judge = 1;

        System.out.println("Enter judge 1 score");
        int score1 = scan.nextInt();
        System.out.println("Enter judge 2 score");
        int score2 = scan.nextInt();
        System.out.println("Enter judge 3 score");
        int score3 = scan.nextInt();

        System.out.println("Enter person 1st score");
        int person1Score = scan.nextInt();
        System.out.println("Enter person 2nd score");
        int person2Score = scan.nextInt();

        int ourAverageScore = (score1 + score2 + score3) /3;

        if (ourAverageScore> person1Score && ourAverageScore > person2Score){
            System.out.println ("First place!");
        }else if ((ourAverageScore > person1Score && ourAverageScore < person2Score) || (ourAverageScore < person1Score && ourAverageScore > person2Score)){
            System.out.println ("Second place");
        }else {
            System.out.println ("Third place");
        }
    }
}
