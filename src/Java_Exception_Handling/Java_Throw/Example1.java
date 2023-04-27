package Java_Exception_Handling.Java_Throw;

public class Example1 {

    public static void test() {
        try {
            throw new ArithmeticException(" Hello ");
        } catch (ArithmeticException e) {
            System.out.println("Caught throw exception in method.");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[]) {
        try {
            test();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception in main.");
        }
    }
}
