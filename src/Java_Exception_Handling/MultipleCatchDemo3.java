package Java_Exception_Handling;

public class MultipleCatchDemo3 {

    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            System.out.println(a[10]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");

        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception occurs");

        } catch (Exception e) {
            System.out.println("Parent Exception occurs");

        }
        System.out.println("Rest of the program");
    }
}
