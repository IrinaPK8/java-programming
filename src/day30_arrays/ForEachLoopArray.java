package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        // indexes -   0    1   2   3    4    5    6    7    8   9
        int [] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNum : data){           /**  loop reads from array number by number and assigns to temp variable
                                            when the last one is reach --> loop exits*/
            System.out.println(eachNum);
        }
        for (int n : data){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-----------FOR LOOP-------------");
                for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println();

                //PRINT LAST VALUE IN ARRAY WITHOUT USING LENGTH -1
        System.out.println("last value is " + data[data.length - 1]);

        // LOOP BACKWARDS - ALL NUMBERS IN THE SAME LINE

        for (int idx = data.length - 1; idx >= 0; idx --){  // idx >=  - means index  should be included
            System.out.print(data[idx] + " ");
        }
    }
}
