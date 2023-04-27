package LoopControlStatements;

public class Do_While_Loop {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("Value of i is :" + i);
            i = i + 3;
        }
        while (i < 15);

        System.out.println("-------------------------------------------");

        //Condition is already satisfied, still 1 round of execution
        int j = 10;
        do
        {
            j = j + 2;
            System.out.println("Value of i is :"+j);
        }
        while (j<10);
    }
}
