package Java_OOP.Java_Interface;

public class InterfaceTest implements MyInterface{

    public void method1() {
        System.out.println("Implementation of Method 1");
    }

    public void method2() {
        System.out.println("Implementation of Method 2");
    }

    public static void main(String[] args) {

        MyInterface interTest = new InterfaceTest();
        interTest.method1();
        interTest.method2();

    }
}
