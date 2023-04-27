package DataTypes_Operators;

public class Assignment_Operator {

    public static void main(String[] args) {

        int x = 45;
        int y = 10;
        int z = 15;

        System.out.println("Value of x: " + x);

        x += 5;
        System.out.println("New value of x after addition: " + x);

        // This will use new value of x which is 50 to perform the operation
        x -= 10;
        System.out.println("New value of x after subtraction: " + x);

        // This will use new value of x which is 40 to perform the operation
        x *= 2;
        System.out.println("New value of x after multiplication: " + x);

        // This will use new value of x which is 80 to perform the operation
        x /= 5;
        System.out.println("New value of x after division: " + x);

        // This will use new value of x which is 16 to perform the operation
        x %= 3;
        System.out.println("New value of x as division reminder: " + x);

        // Multiple Assignment
        System.out.println("Value of y and z: " + y + " and " + z);
        y = z = 100;
        System.out.println("New value of y and z: " + y + " and " + z);

        /*Output

        Value of x: 45
        New value of x after addition: 50
        New value of x after subtraction: 40
        New value of x after multiplication: 80
        New value of x after division: 16
        New value of x as division reminder: 1
        Value of y and z: 10 and 15
        New value of y and z: 100 and 100

        */

    }
}
