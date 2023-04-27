package Java_Access_Modifiers.Parent_B;

import Java_Access_Modifiers.Parent_A.Demo_Protected_1;

public class Demo_Protected_2 extends Demo_Protected_1 {

    public static void main(String[] args) {

        Demo_Protected_2 obj1 = new Demo_Protected_2();


        System.out.println("Value of X; " + obj1.x);
        obj1.display();

    }
}
