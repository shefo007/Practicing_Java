package LoopControlStatements;

public class While_Loop {
    public static void main(String[] args) {

        int i = 0;
        while (i < 15) {

            System.out.println("Value of i is :" + i);
            i = i + 3;
        }

        System.out.println("--------------------------------------------");

        // In this case, value of j will be 0 and it will run infinite times.
        int j = 0;
        while (j < 15) {
            System.out.println("Value of j is :" + j);
        }
        {
            j = j + 3;
        }
    }
}
