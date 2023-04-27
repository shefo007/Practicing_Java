package DataTypes_Operators;

public class Relational_Operator {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("x is equal to y: " + (x == y));
        System.out.println("x is not equal to y: " + (x != y));
        System.out.println("x is greater than y: " + (x > y));
        System.out.println("x is less than y: " + (x < y));
        System.out.println("x is greater than or equal to y: " + (x >= y));
        System.out.println("x is less than or equal to y: " + (x <= y));

        /*Output
        * x is equal to y: false
          x is not equal to y: true
          x is greater than y: false
          x is less than y: true
          x is greater than or equal to y: false
          x is less than or equal to y: true */
    }
}
