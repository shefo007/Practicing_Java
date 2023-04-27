package Java_OOP.Java_Interface;

public class MultipleInterfaceTest implements Interface2 {

    public void method1() {
        System.out.println("Implementation of Method 1");
    }

    public void method2() {
        System.out.println("Implementation of Method 2");
    }

    public static void main(String[] args) {

        Interface2 obj = new MultipleInterfaceTest();
        obj.method1();
        obj.method2();
    }
}
