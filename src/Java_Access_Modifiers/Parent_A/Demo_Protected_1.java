package Java_Access_Modifiers.Parent_A;

public class Demo_Protected_1 {

    protected int x = 10; // protected variable

    protected Demo_Protected_1() { // protected constructor

        System.out.println("Protected Constructor");
    }

    protected void display() { // protected method
        System.out.println("Display protected method");
    }
}
