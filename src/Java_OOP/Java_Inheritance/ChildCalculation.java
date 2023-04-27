package Java_OOP.Java_Inheritance;

public class ChildCalculation extends ParentCalculation {
    int c;

    public void multiplication(int a, int b) {
        c = a * b;
        System.out.println("The multiplication of the given numbers:" + c);
    }

    public static void main(String[] args) {
        ChildCalculation cal = new ChildCalculation();

        cal.addition(10, 14);
        cal.multiplication(5, 6);

    }
}
