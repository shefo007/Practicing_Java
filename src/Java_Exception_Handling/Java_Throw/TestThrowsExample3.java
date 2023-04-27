package Java_Exception_Handling.Java_Throw;

public class TestThrowsExample3 {

    public static void main(String[] args) {
        try {
            Test test = new Test();
            test.method();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("Continue the program...");
    }
}
