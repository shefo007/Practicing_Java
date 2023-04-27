package Java_Access_Modifiers.Parent_A;

public class Demo_Private_1 {

    private int x = 10; // private variable

    private Demo_Private_1() {
        System.out.println("Private Constructor");
    }

    private void display() { // private method
        System.out.println("Display private method");
    }

    public static void main(String[] args) {

        Demo_Private_1 obj1 = new Demo_Private_1();

        System.out.println("Value of X :" + obj1.x);
        obj1.display();
    }
}
