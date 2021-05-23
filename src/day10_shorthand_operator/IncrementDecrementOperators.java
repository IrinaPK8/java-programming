package day10_shorthand_operator;

public class IncrementDecrementOperators {
    public static void main (String [] args){
        int i =1;
        System.out.println("i =" + i);
        i++;
        System.out.println("i =" + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i =" + i);

                // 4 WAYS TO INCREASE BY 1
        int linesOfCode= 15;
        System.out.println("LinesOFCode = " + linesOfCode);
        linesOfCode = linesOfCode + 1;   // traditional way
        linesOfCode += 1 ;               // shorthand operator
        linesOfCode ++;                   //increments
        ++linesOfCode;                    // increments
                // ++LinesOfCode++; ERROR
        System.out.println("LinesOFCode = " + linesOfCode);

                // 4 WAYS TO DECREASE BY 1
        linesOfCode = linesOfCode - 1;   // traditional way
        linesOfCode -= 1 ;               // shorthand operator
        linesOfCode --;                   //decrements
        --linesOfCode;                    //decrements
        // --LinesOfCode--; ERROR
        System.out.println("LinesOFCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;                       // switches to the next letter - b
        System.out.println("letter = " + letter);
        letter++;
        letter++;
        letter++;
        letter++;
        letter++;
        System.out.println("letter = " + letter);
        letter--;                       // goes one character back in ASCII table
        System.out.println("letter = " + letter);
        letter--; letter--; letter--; letter--; letter--; letter--; letter--; letter--; letter--;
        System.out.println("letter = " + letter);

    }
}
