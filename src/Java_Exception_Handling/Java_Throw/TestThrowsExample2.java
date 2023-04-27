package Java_Exception_Handling.Java_Throw;

public class TestThrowsExample2 {

    public static void main(String[] args) {
        try {
            Demo demo = new Demo();
            demo.method();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("Continue the program...");
    }
}