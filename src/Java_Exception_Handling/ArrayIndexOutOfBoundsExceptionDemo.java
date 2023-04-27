package Java_Exception_Handling;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        {
            try {
                // Create an array of size 5
                int a[] = new int[5];

                // Access 11th element from array of size 5
                a[10] = 9;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index is Out Of Bounds");
            }
        }
    }
}
