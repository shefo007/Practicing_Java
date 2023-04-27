package Java_Decision_Making;

public class Demo {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (y > x) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("x is equal to y");
        }

        System.out.println(); // for making output readable

        //******************break**********************
        for (int i = 1; i <= 5; i++) {

            if (i == 2) {
                break;
            }
            System.out.println("Value of i is: " + i);
        }
        System.out.println("First loop finishes!");

        System.out.println();

        //***************continue***************
        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                continue;
            }
            System.out.println("Value of i is: " + i);
        }
        System.out.println("Second loop finishes!");


    }
}
