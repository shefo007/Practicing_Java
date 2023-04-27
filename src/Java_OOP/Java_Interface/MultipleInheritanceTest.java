package Java_OOP.Java_Interface;

public class MultipleInheritanceTest implements Interface1, Interface2 {

    public void method1() {
        System.out.println("Implementation of Method 1");
    }

    public void method2() {
        System.out.println("Implementation of Method 2");
    }


    public static void main(String[] args) {
        MultipleInheritanceTest test = new MultipleInheritanceTest();
        test.method1();
        test.method2();
    }

}
