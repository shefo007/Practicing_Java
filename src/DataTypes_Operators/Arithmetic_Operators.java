package DataTypes_Operators;

public class Arithmetic_Operators {

    public static void main(String[] args) {

        int x = 35;
        int y = 10;
        int z;

        z = x + y;
        System.out.println("Addition of 2 numbers: " + z);

        z = x - y;
        System.out.println("Subtraction of 2 numbers: " + z);

        z = x * y;
        System.out.println("Multiplication of 2 numbers: " + z);

        z = x / y;
        System.out.println("Division of 1 number by another: " + z);

        z = x % y;
        System.out.println("Division Reminder: " + z);

        x++;
        System.out.println("Increment of x: " + x);

        y--;
        System.out.println("Decrement of y: " + y);

        /* Output:
        *   Addition of 2 numbers: 45
            Subtraction of 2 numbers: 25
            Multiplication of 2 numbers: 350
            Division of 1 number by another: 3
            Division Reminder: 5
            Increment of x: 36
            Decrement of y: 9
        */
    }
}
