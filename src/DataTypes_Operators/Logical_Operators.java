package DataTypes_Operators;

public class Logical_Operators {

    public static void main(String[] args) {

        boolean value_1 = true;
        boolean value_2 = false;

        System.out.println("Check if both the boolean variables are true : "
                + (value_1 && value_2));

        System.out.println("Check if even one of the boolean variable is true : "
                + (value_1 || value_2));

        System.out.println("Change the state of the Output_1 to false : "
                + (!value_1));

    }
}
