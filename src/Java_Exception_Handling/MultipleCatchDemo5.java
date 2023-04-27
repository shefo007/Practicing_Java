package Java_Exception_Handling;

public class MultipleCatchDemo5 {

    public static void main(String[] args) {

        /* try block has 2 exceptions.
        * It will call the first suitable catch block for the first
        * try statement which has thrown the exception.*/
        try {
            int a[] = new int[10];
            a[15] = 30 / 0;
            System.out.println(a[20]);

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
