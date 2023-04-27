package Java_Exception_Handling;

public class MultipleCatchDemo1 {

    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            a[15] = 30 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");

        } catch (Exception e) {
            System.out.println("Parent Exception occurs");

        }
        System.out.println("Rest of the program");
    }
}
