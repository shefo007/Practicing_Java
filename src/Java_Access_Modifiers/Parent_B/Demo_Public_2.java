package Java_Access_Modifiers.Parent_B;

import Java_Access_Modifiers.Parent_A.Demo_Public_1;

public class Demo_Public_2 {

    public static void main(String[] args) {

        Demo_Public_1 obj1 = new Demo_Public_1();

        System.out.println("Value of X: " + obj1.x);
        obj1.display();
    }
}
