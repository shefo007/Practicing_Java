package Java_Exception_Handling;

public class NullPointerDemo {

    public static void main(String[] args) {
        {
            try {
                String a = null; // null value
                System.out.println(a.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            }
        }
    }
}
